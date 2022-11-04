public class Dog extends Animal {
    private String name;
    private static int dogCount;

    public Dog() {
        this.name = "Unnamed dog";
        dogCount++;
    }

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    @Override
    protected void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " ran " + 500 + " meters and wanted another " + (distance - 500));
        } else if (distance < 0) {
            System.out.println("Stupid " + name + " ran backs away");
        } else if (distance == 0) {
            System.out.println(name + " licks tail");
        } else {
            System.out.println(name + " ran " + distance + " meters");
        }
    }

    @Override
    protected void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " swam " + 10 + " meters and wanted another " + (distance - 10));
        } else if (distance < 0) {
            System.out.println("Stupid " + name + " swam backs away");
        } else if (distance == 0) {
            System.out.println(name + " wanted to lick tail, but began to drown");
        } else {
            System.out.println(name + " swam " + distance + " meters");
        }
    }

    private static int getCount() {
        return dogCount;
    }

    protected static void printCount() {
        System.out.println("there are " + getCount() + " dogs in our dog-cat world");
    }
}
