package isp.lab5.exercise5;

public class Dear extends Animal implements Herbivorous {

    private final int chanceToRunSuccessfully;

    public Dear(String species, int age, int chanceToRunSuccessfully) {
        super(species, age);
        this.chanceToRunSuccessfully = chanceToRunSuccessfully;
    }

    @Override
    public void eat() {
        System.out.println("Dear eats grass");
    }


    @Override
    public void runSuccessfully() {
        System.out.println("Dear " + this.species + " run successfully at age " + this.age + " with a chance of " + this.chanceToRunSuccessfully + "%");


    }

    @Override
    public void runFailed() {
        System.out.println("Dear " + this.species + " run failed at age " + this.age + " with a chance of " + this.chanceToRunSuccessfully + "%");

    }

    @Override
    public int getChancesToRunSuccessfully() {
        return chanceToRunSuccessfully;
    }

    @Override
    public String toString() {
        return "Dear{" +
                "species='" + species + '\'' +
                ", age=" + age +
                ", chanceToRunSuccessfully=" + chanceToRunSuccessfully +
                '}';
    }
}
