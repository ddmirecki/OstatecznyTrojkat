package pl.ostatecznyTrojkat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-05.
 */
public class Math {
    public static List<Factors> getFactors(int number) {
        if (number == 0) {
            throw new IllegalArgumentException();
        } else {
            List<Factors> list = new ArrayList<Factors>();
            for (int i = 1; i <= java.lang.Math.abs(number); i++) { //dla wartosci ujemnych
                if (number % i == 0) {
                    int secondNumber = number / i;
                    list.add(new Factors(i, secondNumber));
                }
            }
            return list;
        }
    }
}
