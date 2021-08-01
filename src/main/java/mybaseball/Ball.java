package mybaseball;

public class Ball {
    private int position;
    private CheckBallNo ballNo;

    public Ball (int position, int ballNo) {
        this.ballNo = new CheckBallNo(ballNo);
        this. position = position;
    }

    // 숫자야구 체크 후 상태값 반환
    public BallStatus Play(Ball ball) {
        if(equals(ball)){
            return BallStatus.STRIKE;
        }
        if(checkBall(ball)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    // 숫자는 같으나 자리가 다를 경우
    private boolean checkBall (Ball ball) {
        return ball.ballNo.getBallNo() == this.ballNo.getBallNo();
    }

    @Override
    public boolean equals(Object obj) {
        Ball check = (Ball) obj;
        return (this.position == check.position && this.ballNo.getBallNo() == check.ballNo.getBallNo());
    }
}
