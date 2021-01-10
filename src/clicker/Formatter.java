package clicker;

public class Formatter {

    private static final String[] suffixes = {"", "k", "M", "B", "T", "q", "Q", "s", "S", "O", "N"};

    //input: 10 230 000 -> 10.23M
    public String format(double number) {
        int suffixSize = 0;

        while (number > 999) {
            suffixSize++;
            number /= 1000;
        }

        if(Math.floor(number) == number){
            return String.format("%.0f%s", number, suffixes[suffixSize]);
        } else {
            return String.format("%.2f%s", number, suffixes[suffixSize]);
        }
    }
}