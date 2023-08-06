package CompositePattern;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck()); // Decorator Pattern
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck()); // Decorator Pattern
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall()); // Decorator Pattern
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck()); // Decorator Pattern
    }
}
