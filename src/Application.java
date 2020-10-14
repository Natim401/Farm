import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Pet[] pets = generatePets();
        Wild[] wilds = generateWilds();
        while (farmer.resourse > 1) {
            passDay(farmer, pets, wilds);
        }
    }
    public static Pet[] generatePets(){
        Pet[] pets = new Pet[10];
        for (Pet pet : pets){
            pet = Pet.petFactory();
        }
        return pets;

    }

    public static Wild[] generateWilds(){
        Wild[] wilds = new Wild[10];
        for (Wild wild : wilds){
            wild = Wild.wildFactory();
        }
        return wilds;
    }


    public static void passDay(Farmer farmer, Pet[] pets, Wild[] wilds) {

        farmer.resourse -= 2;

        int randomPetId = new Random().nextInt(pets.length);
        int randomWildId = new Random().nextInt(wilds.length);
        if (farmer.chaseAnimal()){
            wilds[randomWildId].runAway();
        } else {
            Pet pet = pets[randomPetId];
            Wild wild = wilds[randomWildId];
            if (wild.speed > pet.speed){
                pet.health -= wild.force;
            }
        }

        for (Pet pet: pets){
            farmer.feedAnimal(pet);
        }
        if (!farmer.collectGoods(pets)){
            farmer.eatGoods(pets);
        }
    }
}
