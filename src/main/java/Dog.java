public class Dog extends Animal{




    @Override
    public void makeSound() {
        System.out.println("Vuf");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public boolean showMood(boolean mood) {
        if (mood == true) {
            System.out.println("logrer");
        } else if (mood == false) {
            System.out.println("knurrer");
        }
        return mood;
    }


}
