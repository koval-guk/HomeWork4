public class Cat extends Animal {
    private String name;
    private static int catCount;

    public Cat() {
        this.name = "Unnamed cat";
        catCount++;
    }

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    @Override
    protected void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " ran " + 200 + " meters and wanted another " + (distance - 200));
        } else if (distance < 0) {
            System.out.println("Stupid " + name + " ran backs away");
        } else if (distance == 0) {
            System.out.println(name + " licks paw");
        } else {
            System.out.println(name + " ran " + distance + " meters");
        }
    }

    @Override
    protected void swim(int distance) {
        System.out.println(name + " wanted to swim " + distance + " meters, but drowned");
    }

    private static int getCount() {
        return catCount;
    }

    protected static void printCount() {
        System.out.println("there are " + getCount() + " cats in our circus");
    }
}
