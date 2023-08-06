package AbstractFactoryPattern;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();  // without decorator
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory(); // with decorator
        AbstractDuckFactory countingEchoDuckFactory = new CountingEchoDuckFactory(); // with decorator
        simulator.simulate(countingEchoDuckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());  // Using the adapter

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);  // Simulating the pigeon's quack

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");

    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}