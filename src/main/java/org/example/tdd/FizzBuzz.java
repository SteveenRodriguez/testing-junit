package org.example.tdd;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            numbers.add(getNumber(i));
        }
        return numbers;
    }

    private String getNumber(int i) {
//        return i % 3 == 0 && i % 5 == 0 ? "FizzBuzz"
//                : i % 3 == 0 ? "Fizz"
//                : i % 5 == 0 ? "Buzz"
//                : String.valueOf(i);

        if (isMultiple(i,3) && isMultiple(i,5)) {
            return FIZZ+BUZZ;
        } else if (isMultiple(i,3)) {
            return FIZZ;
        } else if (isMultiple(i,5)) {
            return BUZZ;
        }
        return "" + i;
    }

    private boolean isMultiple(int value, int multiple) {
        return value % multiple == 0;
    }
}
