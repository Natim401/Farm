public class Wild {
    private String name;
    private int weight;
    public int speed;
    public int force;
    private int runAwayCount = 0;

    public Wild(String name, int weight, int speed, int force) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.force = force;
    }

    public void runAway() {
        this.runAwayCount++;
    }

    public static Wild wildFactory() {
        String[] types = {"fox", "wolf", "bear"};
        Wild unit = null;
        switch (types[(int) (Math.random() * types.length)]) {
            case "fox":
                unit = new Fox(
                        "fox",
                        (int) (Math.random() * 10) + 7,
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10
                );
                break;
            case "wolf":
                unit = new Wolf(
                        "wolf",
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10
                );
                break;
            case "bear":
                unit = new Bear(
                        "bear",
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10,
                        (int) (Math.random() * 10) + 10
                );
                break;
        }
        return unit;
    }
}