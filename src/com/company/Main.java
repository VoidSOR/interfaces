package com.company;

public class Main {
    public static void main(String[] args) {
        Cat lori = new Cat();
        Dog booble = new Dog();

        lori.say();
        booble.say();

        findOwner(lori);
        findOwner(booble);

        System.out.println("Lori:  " + lori.getOwner() + "  Booble:  " + booble.getOwner() );

    }

    private static void findOwner(AbstractAnimal animal) {
        if (animal.getClass() == Cat.class) {
            animal.setOwner("Nikita");
        }

        if (animal.getClass() == Dog.class) {
            animal.setOwner("Egor");
        }
    }
}
