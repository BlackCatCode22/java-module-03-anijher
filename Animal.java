//package myanimals;

public class Animal {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getCatCount());


        System.out.println(Dog.getDogCount());

        Dog myDog = new Dog();
        myDog.Woof();
        myDog.name = "Bruno";
        myDog.age = 4;
        System.out.println("New Dog name is "+myDog.name+", he is "+myDog.age+"");

    }
}