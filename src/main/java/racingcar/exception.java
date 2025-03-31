package racingcar;

public class exception {
    public static void validateInputs(String carNameInput, String tryInput) { // 예외 처리 함수
        if (carNameInput == null || carNameInput.trim().isEmpty()) { // 이름 없는 경우
            throw new IllegalArgumentException("자동차 이름이 입력되지 않았습니다.");
        }
        String[] names = carNameInput.split(",");
        for (String name : names) {
            if (name.trim().isEmpty()) {
                throw new IllegalArgumentException("빈 자동차 이름이 존재합니다.");
            }
            if (name.trim().length() > 5) { // 최대 5자 제한
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
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
