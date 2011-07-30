package williamboxhall;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

public class FizzBuzz {
    private final Map<Integer, String> numberOverrides;

    public FizzBuzz() {
        Map<Integer, String> numberOverrides = new HashMap<Integer, String>();
        numberOverrides.put(3, "Fizz");
        numberOverrides.put(5, "Buzz");
        numberOverrides.put(7, "Pop");
        this.numberOverrides = numberOverrides;
    }

    public String print() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= 100; i++) {
            stringBuffer.append(print(i));
        }
        return stringBuffer.toString();
    }

    private String print(int number) {
        String override = overrideFor(number);
        return "".equals(override) ? valueOf(number) : override;
    }

    private String overrideFor(int number) {
        String override = "";
        for (int numberOverride : numberOverrides.keySet()) {
            if (divisibleBy(numberOverride, number)) {
                override += numberOverrides.get(numberOverride);
            }
        }
        return override;
    }

    private boolean divisibleBy(int divisor, int numerator) {
        return numerator % divisor == 0;
    }
}