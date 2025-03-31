package racingcar;

public class print {
    public static void printRaceStep(String[] carNames, StringBuilder[] positions) {
        for (int i = 0; i < carNames.length; i++) {
            System.out.println(carNames[i] + " : " + positions[i]);

        }
        System.out.println(); // 단계별 개행
    }


    public static void printWinners(String[] carNames, StringBuilder[] positions) {
        int max = 0;
        for (StringBuilder position : positions) {
            max = Math.max(max, position.length());
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < carNames.length; i++) {
            if (positions[i].length() != max) {
                continue;
            }
            if (!result.isEmpty()) {
                result.append(", ");
            }
            result.append(carNames[i]);
        }
        System.out.println("최종 우승자 : " + result);
    }
}
