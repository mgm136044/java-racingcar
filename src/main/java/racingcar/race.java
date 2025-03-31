package racingcar;

import static racingcar.pickRandomNumber.pickRandomNumbers;
import static racingcar.print.printRaceStep;
import static racingcar.print.printWinners;

public class race {
    public static void processRace(String[] carNames, int tryCount) {
        StringBuilder[] positions = new StringBuilder[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            positions[i] = new StringBuilder(); // 각 자동차의 위치 초기화
        }

        for (int i = 0; i < tryCount; i++) {
            int[] randomNumbers = pickRandomNumbers(carNames.length);
            updatePositions(carNames, positions, randomNumbers);
            printRaceStep(carNames, positions);
        }
        printWinners(carNames, positions);
    }

    private static void updatePositions(String[] carNames, StringBuilder[] positions, int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > 3) {
                positions[i].append("-");
            }
        }
    }

}
