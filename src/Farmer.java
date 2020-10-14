import java.util.Random;

public class Farmer {
    public int resourse = 5;
    public boolean collectGoods(Pet[] pets){
        boolean goodsCollected = false;
        for (Pet pet: pets){
            if (pet.resource > 0){
                goodsCollected = true;
            }
            this.resourse += pet.resource;
        }
        return goodsCollected;
    }
    public void eatGoods(Pet[] pets){
        for (Pet pet: pets){
            if (pet.foodable){
                this.resourse += pet.weight;
                pet = null;
                break;
            }
        }
    }
    public boolean chaseAnimal(){
        Random random = new Random();
        return random.nextBoolean();
    }
    public void feedAnimal(Pet pet){
        pet.feed();
    }
}
