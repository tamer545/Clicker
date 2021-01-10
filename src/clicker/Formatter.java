package clicker;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Formatter {

    private static final String[] suffixes = {"", "k", "M", "B", "T", "q", "Q", "s", "S", "O", "N"};
    //private static final String[] suffixes = {"", "k"}; //for large number testing

    private static final BigDecimal _999 = BigDecimal.valueOf(999);
    private static final BigDecimal THOUSAND = BigDecimal.valueOf(100);
    private static final BigDecimal TEN = BigDecimal.TEN;

    //input: 10 230 000 -> 10.23M
    public String format(double number) {
        int suffixSize = 0;
        boolean scientific = false;

        while (number > 999) {

            if (suffixSize == suffixes.length - 1) {
                scientific = true;
                break;
            }

            suffixSize++;
            number /= 1000;
        }

        if (scientific) {
            int exp = 3 * suffixSize;
            while (number >= 10) {
                exp++;
                number /= 10;
            }
            return String.format("%.2fE%d", number, exp);
        } else {
            if (Math.floor(number) == number) {
                return String.format("%.0f%s", number, suffixes[suffixSize]);
            } else {
                return String.format("%.2f%s", number, suffixes[suffixSize]);
            }
        }
    }
}
