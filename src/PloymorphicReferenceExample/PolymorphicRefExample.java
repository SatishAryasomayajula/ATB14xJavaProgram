package PloymorphicReferenceExample;

public class PolymorphicRefExample {

    public static void main(String[] args) {
        AnimalClass animal;

        animal= new DogClass();
        animal.makeSound();

        animal= new CatClass();
        animal.makeSound();






    }
}
