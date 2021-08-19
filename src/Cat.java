public class Cat extends Animal {
    public Cat (int runAnimalMax) {
        super("Муся", runAnimalMax, 0);
    }
    public void canSwim (int swimLength) {
        System.out.println("Кошка Муся не умеет плавать!");
    }
}
