import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FizzBuzz {

    private IntStream integerList;

    public FizzBuzz(Integer length) {
        assert length >= 0 : "length should not be negative";
        integerList = IntStream.rangeClosed(0, length - 1);
    }

    public IntStream getIntegerList() {
        return integerList;
    }


    public List<String> fizzBuzz() {

        return integerList.mapToObj(elem -> {
            String value = "";
            boolean modified = false;
            if (elem % 3 == 0)
            {
                value = "Fizz";
                modified = true;
            }
            if (elem % 7 == 0)
            {
                value = "It's a trap !";
                modified = true;
            }
            if (elem % 5 == 0 && elem % 3 == 0)
            {
                value = "Fizz Buzz";
                modified = true;
            }
            if (elem % 5 == 0)
            {
                value = "Buzz";
                modified = true;
            }
            if (elem == 42)
            {
                value = "La grande question sur la vie, l'univers et le reste!";
                modified = true;
            }
            if(!modified)
                value = String.valueOf(elem);
            return value;
        }).collect(toList());
    }
}
