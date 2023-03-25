package myproject;

public class Dog {
    public Dog() {
        super();
    }

    public String sayHi() {
        return " woof " + "Jeff";
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        for (int count = 0; count < 3; count++) {
            System.out.println(count + myDog.sayHi());
        }

    }
}
