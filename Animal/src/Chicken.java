public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Oh yeah!";
    }

    @Override
    public String howToEat() {
        return "boil";
    }
}
