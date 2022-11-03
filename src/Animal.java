public class Animal {
    private String name;
    private static int animalCount;

    public Animal() {
        this.name = "Unnamed animal";
        animalCount++;
    }

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    protected void run(int distance) {
        System.out.println(name + " ran " + distance + " meters, because it can");
    }

    protected void swim(int distance) {
        System.out.println(name + " ran across the water " + distance + " meters, because it can");
    }

    private static int getCount() {
        return animalCount;
    }

    protected static void printCount() {
        System.out.println("there are " + getCount() + " animals in our circus");
    }

}
