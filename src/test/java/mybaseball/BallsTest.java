package mybaseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    private Ball ball;
    private Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 4);
    }

    @Test
    void Play() {
        Ball answer = new Ball(1, 4);
        BallStatus status = com.Play(answer);
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
}
