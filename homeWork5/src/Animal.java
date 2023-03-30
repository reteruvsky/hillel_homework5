public class Animal {
    static int countAnimal;

    public Animal() {
        countAnimal++;
    }

    public static void action(Animal animal) {
        animal.run(100);
        animal.swim(5);
    }

    public void run(int index) {
        System.out.println("Животное пробежало " + index + " м.");
    }

    public void swim(int index) {
        System.out.println("Животное проплыло " + index + " м.");
    }
}

class Dog extends Animal {
    static int countDog;

    public Dog() {
        super();
        countDog++;
    }

    public void run(int index) {
        if (index <= 500) {
            System.out.println("Волчок прбежал " + index + " м.");
        }
    }

    public void swim(int index) {
        if (index <= 10) {
            System.out.println("Волчок проплыл " + index + " м.");
        }
    }
}

class Cat extends Animal {
    static int countCat;

    public Cat() {
        super();
        countCat++;
    }

    public void run(int index) {
        if (index <= 200) {
            System.out.println("Гришка пробожал " + index + " м.");
        }
    }

    public void swim(int index) {
        System.out.println("Коты не умеют плавать!");
    }
}
