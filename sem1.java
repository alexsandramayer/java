package seminar1;



// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5
/* import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
} 
 */

// Задача 2. Вывести все простые числа от 1 до 1000

/* import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
} */


// Задача 3. Реализовать простой калькулятор

/* import java.util.Scanner;

public class task3 {
    // метод получения числа
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
        scan.close();
    }

    // метод получения числа операции
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    // метод получения результата
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

} */




