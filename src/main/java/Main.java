public class Main {

    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        System.out.println(cat.eat("fish"));
        System.out.println(dog.eat("dogfood"));

    }
}
