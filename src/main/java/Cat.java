public class Cat extends Animal {



    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public boolean showMood(boolean mood) {
        if (mood == true) {
            System.out.println("spinder");
        } else if (mood == false) {
            System.out.println("hvæser");
        }return mood;
    }
}
