package racingcar;

public class exception {
    public static void validateInputs(String carNameInput, String tryInput) {
        validateCarNames(carNameInput);
        validateTryCount(tryInput);
    }
    public static void validateCarNames(String carNameInput) {
        if (carNameInput == null || carNameInput.trim().isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 입력되지 않았습니다.");
        }
        String[] names = carNameInput.split(",");
        for (String name : names) {
            if (name.trim().isEmpty()) { // 빈 이름 허용x
                throw new IllegalArgumentException("빈 자동차 이름이 존재합니다.");
            }
            if (name.trim().length() > 5) { // 최대 5자 제한
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
    }
    public static void validateTryCount(String tryInput) {
        try {
            int count = Integer.parseInt(tryInput);
            if (count < 1) {
                throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.", e);
        }
    }
}