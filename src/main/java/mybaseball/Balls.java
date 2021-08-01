package mybaseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    List<Integer> computer;

    public Balls(List<Integer> asList) {
        computer = new ArrayList<>(asList);
    }

    public BallStatus Play (Balls balls) {
        return BallStatus.NOTHING;
    }
}
