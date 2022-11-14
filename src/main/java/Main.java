public class Main {

    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.print("The cat says: " );
        cat.makeSound();

        System.out.print("The dog says: " );
        dog.makeSound();

    }
}
