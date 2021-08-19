public abstract class Animal {
    private String name;
    private int runAnimalMax;
    private int swimAnimalMax;
    public Animal (String name, int runAnimalMax, int swimAnimalMax) {
        this.name = name;
        this.runAnimalMax = runAnimalMax;
        this.swimAnimalMax = swimAnimalMax;
    }
    public void canRun (int runLength) {
        if (runLength > runAnimalMax) {
            System.out.println("Животное" + " " + name + " " + "столько не пробежит, максимум" + " " + runAnimalMax + " " + "метров!");
        }
        else {
            System.out.println("Животное" + " " + name + " " + "пробежало" +" " + runLength +" " + "метров!");
        }
        System.out.println();
    }
    public void canSwim (int swimLength) {
        if (swimLength > swimAnimalMax) {
            System.out.println("Животное" + " " + name + " " + "столько не проплывет, максимум" + " " + runAnimalMax + " " + "метров!");
        }
        else {
            System.out.println("Животное" + " " + name + " " + "проплыло" + " " + swimLength + " " + "метров!");
        }
        System.out.println();
    }
}
