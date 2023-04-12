package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {
    List<Car> cars = new ArrayList<>();

    private static final int RANDOM_MAX_RANGE = 10;

    RacingGame(int carNumber) {
        for (int i = 0; i < carNumber; i++) {
            cars.add(new Car());
        }
    }

    void playRacingGames(int chanceNumber) {
        for (int i = 0; i < chanceNumber; i++) {
            singleStepRacing();
            ResultView.printStatus(getRacingGameResult());
        }
    }

    private void singleStepRacing() {
        for (Car car : cars) {
            car.isCarMove(Utils.getRandomNumber(RANDOM_MAX_RANGE));
        }
    }

    private int[] getRacingGameResult() {
        int[] result = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            result[i] = cars.get(i).steps;
        }
        return result;
    }
}
