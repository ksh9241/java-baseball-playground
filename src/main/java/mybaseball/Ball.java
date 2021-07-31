package mybaseball;

public class Ball {
    private int position;
    private CheckBallNo ballNo;

    public Ball (int position, int ballNo) {
        this.ballNo = new CheckBallNo(ballNo);
        this. position = position;
    }

    public int getBallNo() {
        return this.ballNo.getBallNo();
    }

    public BallStatus Play(Ball ball) {
        return resultBallStatus(ball);
    }

    private BallStatus resultBallStatus(Ball ball) {
        if(equals(ball)){
            return BallStatus.STRIKE;
        }
        if(ball.ballNo == this.ballNo) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object obj) {
        Ball check = (Ball) obj;
        return this == check;
    }
}
