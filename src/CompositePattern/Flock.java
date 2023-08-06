package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();
    Quackable flockLeader = null; // This is the leader of the flock.

    public void add(Quackable quacker) {
        // If flockLeader is null, then this is the first quacker in the flock.
        if (flockLeader == null) {
            flockLeader = quacker;
        } else {
            quackers.add(quacker);
        }
    }

    @Override
    public void quack() {
        // The flock leader quacks three times.
        if (flockLeader != null) {
            flockLeader.quack();
            flockLeader.quack();
            flockLeader.quack();
        }
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}
