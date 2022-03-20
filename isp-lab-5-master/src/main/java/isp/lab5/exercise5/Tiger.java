package isp.lab5.exercise5;

public class Tiger extends Animal implements Carnivorous {
    private final int chanceToHuntSuccessfully;

    public Tiger(String species, int age, int chanceToHuntSuccessfully) {
        super(species, age);
        this.chanceToHuntSuccessfully = chanceToHuntSuccessfully;
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats meat");
    }

    @Override
    public void huntSuccessfully() {
        System.out.println("Tiger " + this.species + " hunt successfully at age " + this.age + " with a chance of " + this.chanceToHuntSuccessfully + "%");

    }

    @Override
    public void huntFailed() {
        System.out.println("Tiger " + this.species + " hunt failed at age " + this.age + " with a chance of " + this.chanceToHuntSuccessfully + "%");
    }

    @Override
    public int getChancesToHuntSuccesfsully() {
        return chanceToHuntSuccessfully;
    }


    @Override
    public String toString() {
        return "Tiger{" +
                "chanceToHuntSuccessfully=" + chanceToHuntSuccessfully +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }
}