public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik");
        murzik.run(50);
        murzik.swim(900);
        murzik.run(15);
        murzik.run(-50);
        Dog sharik = new Dog("Sharik");
        sharik.run(150);
        sharik.swim(600);
        sharik.swim(0);
        Cat bagel = new Cat("Bagel");
        bagel.run(560);
        bagel.run(0);
        bagel.run(700);
        Cat cat = new Cat();
        cat.run(1);
        Dog dog = new Dog();
        dog.swim(0);
        Animal.printCount();
        Cat.printCount();
        Dog.printCount();
    }
}
