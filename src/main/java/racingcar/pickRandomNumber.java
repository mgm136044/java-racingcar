package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
public class pickRandomNumber {
    public static int[] pickRandomNumbers(int count) {
        int[] randomNumberArray = new int[count]; // 배열 먼저 선언
        for (int i = 0; i < count; i++) { // 참가자만큼 랜덤한 숫자 뽑음
            randomNumberArray[i] = Randoms.pickNumberInRange(0, 9);
        }
        return randomNumberArray;
    }
}
