package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;


public class Application {
    public static void main(String[] args) {
        java.io.Console c = System.console();
        String CarNameInput = c.readLine("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 로 구분하여 입력)");
        String[] CarName = CarNameInput.split(",");
        String TryInput = c.readLine("시도할 회수는 몇 회인가요?");
        int HowManyTryInput = Integer.parseInt(TryInput);

        int RandomNumber = Randoms.pickNumberInRange(0,9);


    }
}
