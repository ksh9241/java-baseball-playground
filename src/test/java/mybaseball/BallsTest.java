package mybaseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    private Balls com;

    @BeforeEach
    void setUp () {
        com = new Balls(Arrays.asList(1,2,3));
    }

    @Test
    void Play_Nothing() {
        Balls answers = new Balls(Arrays.asList(4,5,6));
        assertThat(com.Play(answers)).isEqualTo(BallStatus.NOTHING);
    }
}
