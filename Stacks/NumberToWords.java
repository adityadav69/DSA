import java.util.Scanner;

public class NumberToWords {
    public static String convertToWords(int number) {
        String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        if (number < 10) return units[number];
        if (number < 20) return teens[number - 10];
        if (number < 100) return tens[number / 10] + (number % 10 == 0 ? "" : " " + units[number % 10]);
        
        if (number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            return units[hundreds] + " hundred" + (remainder == 0 ? "" : " " + convertToWords(remainder));
        }

        return "Number too large";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("In words: " + convertToWords(number));
    }
}