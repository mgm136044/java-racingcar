package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 로 구분하여 입력)");
        String CarNameInput = Console.readLine();
        String[] CarName = CarNameInput.split(",");
        System.out.println("시도할 회수는 몇 회인가요?");
        String TryInput = Console.readLine();
        int HowManyTryInput = Integer.parseInt(TryInput); // 정수형으로 변환

        processRace(CarName, HowManyTryInput);
    }

    public static int[] generateRandomNumbers(int count) {
        int[] RandomNumberArray = new int[count]; // 배열 먼저 선언
        for (int i = 0; i < count; i++) { // 참가자만큼 랜덤한 숫자 뽑음
            RandomNumberArray[i] = Randoms.pickNumberInRange(0, 9);
        }
        return RandomNumberArray;
    }

    public static void processRace(String[] carNames, int tryCount) {
        StringBuilder[] positions = new StringBuilder[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            positions[i] = new StringBuilder(); // 각 자동차의 위치 초기화
        }

        for (int i = 0; i < tryCount; i++) {
            int[] randomNumbers = generateRandomNumbers(carNames.length);
            updatePositions(carNames, positions, randomNumbers);
            printRaceStep(carNames, positions);
        }
        printWinners(carNames, positions);
    }

    private static void updatePositions(String[] carNames, StringBuilder[] positions, int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > 4) {
                positions[i].append("-");
            }
        }
    }


    private static void printRaceStep(String[] carNames, StringBuilder[] positions) {
        for (int i = 0; i < carNames.length; i++) {
            System.out.println(carNames[i] + " : " + positions[i]);

        }
        System.out.println(); // 단계별 개행
    }


        private static void printWinners (String[]carNames, StringBuilder[]positions){
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
