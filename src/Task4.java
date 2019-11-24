import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задача №4
 * Ввести с консоли число в бинарном формате.
 * Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число в бинарном формате:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            try {
                int a = Integer.parseInt(input);
                int result = 0;
                int exponent = 0;
                int currentSymbol;
                while (a > 0) {
                    currentSymbol = a % 10;
                    if ((currentSymbol != 0) & (currentSymbol != 1)) {
                        throw new NumberFormatException();
                    }
                    result += currentSymbol * Math.pow(2, exponent);
                    exponent++;
                    a = a / 10;
                }
                System.out.println(result);
            } catch (NumberFormatException e) {}
    }
}
