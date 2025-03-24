package racingcar;

import java.util.SplittableRandom;

public class Application {
    public static void main(String[] args) {
        java.io.Console c = System.console();

        String carNameinput = c.readLine("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 로 구분하여 입력)");
        String[] carName = carNameinput.split(",");
        String carRealName = c.readLine(",");
        SplittableRandom r = new SplittableRandom();
        int carPosition = r.nextInt(carName.length);



    }
}
