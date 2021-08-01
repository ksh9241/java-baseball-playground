package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseBall {
    public static void main(String [] args) {
        Ball com = new Ball();
        PlayGame(com);
    }

    private static void PlayGame(Ball comBall) {
        int count = 0;

        while(count < 10) {
            try {
                List<Integer> user = userNum();
                if(Check(comBall, user)) {
                    break;
                }
                count++;
                System.out.println("총 시도 횟수 : "+count);
            } catch (Exception e) {
                System.out.println("숫자만 입력해주세요");
            }

        }
        if (count >= 10) {
            System.out.println("10회를 초과하였으므로 게임에서 패배하였습니다. \n정답은 "+comBall.ballList+" 입니다.");
        }
    }

    private static List<Integer> userNum () {
        Scanner sc = new Scanner(System.in);
        List<Integer> user = new ArrayList<>();
        String userNum = sc.nextLine();
        String[] userNumArr = userNum.split("");

        for(String val : userNumArr) {
            user.add(Integer.parseInt(val));
        }
        return user;
    }

    private static boolean Check (Ball comBall, List<Integer> user) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < comBall.ballList.size(); i++) {
            if (comBall.ballList.get(i) == user.get(i)) {
                strike++;
                continue;
            }
            for(int j = 0; j < user.size(); j++) {
                if (comBall.ballList.get(i) == user.get(j)) {
                    ball++;
                    continue;
                }
            }
        }
        if(strike == 3) {
            System.out.println("정답입니다.");
            return true;
        }

        System.out.println("스트라이크 : "+strike+" 볼 : "+ ball);
        return false;
    }
}
