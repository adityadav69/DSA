import java.util.Scanner;

public class NumberToWords {
    private static final String[] belowTwenty = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] thousands = {
        "", "thousand", "million", "billion"
    };

    private static String convertBelowThousand(int num) {
        if (num == 0) return "";
        if (num < 20) return belowTwenty[num];
        if (num < 100) return tens[num / 10] + (num % 10 == 0 ? "" : " " + belowTwenty[num % 10]);
        return belowTwenty[num / 100] + " hundred" + (num % 100 == 0 ? "" : " " + convertBelowThousand(num % 100));
    }

    private static String numberToWords(int num) {
        if (num == 0) return "zero";
        int i = 0;
        String words = "";
        while (num > 0) {
            if (num % 1000 != 0) {
                words = convertBelowThousand(num % 1000) + (thousands[i].isEmpty() ? "" : " " + thousands[i]) + (words.isEmpty() ? "" : " " + words);
            }
            num /= 1000;
            i++;
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(numberToWords(num));
    }
}
