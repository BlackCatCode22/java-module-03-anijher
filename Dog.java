public class Dog {
    private static int dogCount = 0;
    String name;
    int age;

    public void Woof(){
        System.out.println("Woof");
    }

    public Dog () {
        dogCount++;
    }

    public static int getDogCount(){
        return dogCount;
    }
}
