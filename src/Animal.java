public abstract class Animal {
    private static int animalCount;

    public Animal() {
        animalCount++;
    }

    protected abstract void run(int distance);

    protected abstract void swim(int distance);

    private static int getCount() {
        return animalCount;
    }

    protected static void printCount() {
        System.out.println("there are " + getCount() + " animals in our cat-dog world");
    }

}
