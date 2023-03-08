// 1~49 사이의 서로 다른 숫자를 여섯 개 골라 복권의 숫자 조합을 출력하는 프로그램을 작성.
// 정렬된 결과를 출력해야한다.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice7 {
    public List<Integer> getList(int max) {
        return IntStream.rangeClosed(1, max)
                .boxed()
                .collect(Collectors.toList());
    }

    public Integer choice(List<Integer> numbers, int index) {
        return numbers.remove(index);
    }

    public List<Integer> lottery() {
        List<Integer> numbers = getList(49);
        List<Integer> chosen = new ArrayList<>();

        for (int i = 0; i < 6; i += 1) {
            int randomNumber = new Random().nextInt(numbers.size() + 1);

            chosen.add(choice(numbers, randomNumber - 1));
        }

        chosen.sort((Comparator.naturalOrder()));

        return chosen;
    }
}
