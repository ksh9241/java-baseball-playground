package mybaseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallTest {
    private Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 4);
    }

    @Test
    void Nothing() {
        BallStatus status = com.Play(new Ball(1,3));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void Ball() {
        BallStatus status = com.Play(new Ball(2, 4));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void Strike() {
        BallStatus status = com.Play(new Ball(1,4));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
}
