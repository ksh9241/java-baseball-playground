package test;

import java.util.ArrayList;
import java.util.List;

public class Ball {
    List<Integer> ballList;
    private static int [] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public Ball() {
        ballList = randomNum();
    }

    private static List<Integer> randomNum() {
        List<Integer> arr = new ArrayList<>();
        int [] check = new int[9];
        while(arr.size() < 3) {
            int random = (int) Math.ceil(Math.random() * 9) - 1;
            if(check[random] == 0) {
                arr.add(numArr[random]);
                check[random]++;
            }
        }
        return arr;
    }
}
