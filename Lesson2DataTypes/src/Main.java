import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int intValue = 10000;

       //Неявное преобразование типа "int" в "double"
        long longFromInt = intValue;

        //Явное преобразование типа
        double doubleVal = 3.14159;
        Double doubleObject = Double.valueOf(doubleVal);

        System.out.println("Это значение переменной doubleObject: " + doubleObject);

        double doubleValue = (double) intValue;
        System.out.println(doubleValue);

        String doubleValButString = "3";
        double doubleFromString = Double.parseDouble(doubleValButString);
        int intFromString = Integer.parseInt(doubleValButString);
        System.out.println(doubleFromString);
        System.out.println(intFromString);

        //Сложение с помощью объектов - НЕ ИСПОЛЬЗУЕТСЯ!
        //Integer sum = new Integer(33) + new Integer(66);
        int sum = 2 + 3;
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите информацию: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum1 = a + b;
        int dicr1 = a - b;
        int prod1 = a * b;
        int div1 = a / b;
        System.out.println("Сумма чисел: " + a + " и " + b + " равна " + sum1);
        System.out.println("Разность чисел: " + a + " и " + b + " равна " + dicr1);
        System.out.println("Произведение чисел: " + a + " и " + b + " равна " + prod1);
        System.out.println("Частное чисел: " + a + " и " + b + " равна " + div1);

        StringBuilder sbAppend = new StringBuilder("Привет, ");
        sbAppend.append("мир !");
        System.out.println(sbAppend);
        //reverse() - переворачивает строку
        //delete(x,y) - удаляет символы между указанными индексами
        //length() - возвращает длину строки
        //toString() - преобразует StringBuilder в обычную строку

        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();
        StringBuilder sbReverse = new StringBuilder(str);
        sbReverse.reverse();
        str = sbReverse.toString();
        System.out.println(str);

        Scanner scanner2 = new Scanner(System.in);
        int z = scanner2.nextInt();
        if (z >= 0 & z <=6) {
            System.out.println("Утро");
        }
        else {
            System.out.println("Вечер");
        }

        //Условный оператор
        //Если
        if (sum==5) {
            System.out.println("Ответ = 5");
        }
        else if (sum == 10) {
            System.out.println("Ответ равен 10");
        }
        else {
            System.out.println("Ничего!");
        }


    }
}