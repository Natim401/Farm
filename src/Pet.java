public class Pet {
    final static int maxHealth = 100;
    private String name;
    public int weight;
    public int speed;
    public int health;
    public int resource;
    public boolean foodable;

    public Pet(String name, int weight, int speed, int health, int resource, boolean foodable) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.health = health;
        this.resource = resource;
        this.foodable = foodable;
    }

    public void feed(){
        if (this.health < maxHealth) {
            this.health++;
        }
    }



    public static Pet petFactory(){
        String[] types = {"cat", "cow", "rabbit", "chicken"};
        Pet unit = null;
        switch (types[(int) (Math.random() * types.length)]){
            case "cat":
                unit = new Cat(
                        "cat",
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        0, false
                );
                break;
            case "cow":
                unit = new Cow(
                        "cow",
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        10, true
                );
                break;
            case "rabbit":
                unit = new Rabbit(
                        "rabbit",
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        0, true
                );
                break;
            case "chicken":
                unit = new Chicken(
                        "chicken",
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        7, true
                );
                break;}
        return unit;
    }
}



