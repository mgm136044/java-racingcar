package racingcar;
import camp.nextstep.edu.missionutils.Console;

import static racingcar.exception.validateInputs;
import static racingcar.race.processRace;

public class Application {
    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 로 구분하여 입력)");
        String CarNameInput = Console.readLine();
        System.out.println("시도할 회수는 몇 회인가요?");
        String TryInput = Console.readLine();

        validateInputs(CarNameInput, TryInput); // 예외 처리 함수
        String[] CarName = CarNameInput.split(",");
        int HowManyTryInput = Integer.parseInt(TryInput); // 정수형으로 변환

        processRace(CarName, HowManyTryInput);
    }

}