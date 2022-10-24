import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {
    public static final String BUZZ = "BUZZ";
    public static final String FIZZ = "FIZZ";

    public List<String> getNumbers() {

        List<String> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(verification(i));
        }
        return numbers;
    }

    private static String verification(int i) {
        if(isMultiple(i, 3) && isMultiple(i, 5)){
            return FIZZ + BUZZ;
        }else if (isMultiple(i, 5)){
            return BUZZ;
        }else if(isMultiple(i, 3)) {
            return FIZZ;
        }
        return "" + i;
    }

    private static boolean isMultiple(int number, int multiple) {
        return number % multiple == 0;
    }
}
