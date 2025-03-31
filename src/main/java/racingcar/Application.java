package racingcar;
import camp.nextstep.edu.missionutils.Console;

import static racingcar.exception.validateInputs;
import static racingcar.race.processRace;

public class Application {
    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 로 구분하여 입력)");
        String carNameInput = Console.readLine();
        System.out.println("시도할 회수는 몇 회인가요?");
        String tryInput = Console.readLine();

        validateInputs(carNameInput, tryInput); // 예외 처리 함수
        String[] carName = carNameInput.split(",");
        int howManyTryInput = Integer.parseInt(tryInput); // 정수형으로 변환

        processRace(carName, howManyTryInput);
    }
}