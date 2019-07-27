import animals.Animal;
import animals.Dog;

public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog("Beniek", 4, "pilnujacy");


        System.out.println(dog.dodaj(3,3));

        String s = dog.whoAreYou();
        System.out.println(s);


    }
}
