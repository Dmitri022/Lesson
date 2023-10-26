public class Main{
    public static void main (String[] args){
        //Переменная для хранения валюты: рубли
        int a; //объявленная переменная
        int walletRu = 2000; //проинициализированная переменная

        //Переменная для хранения валюты: доллар
        int walletDollar = 94;

        //Переменная логического типа
        boolean lie = false;
        boolean truth = true;

        //Информация о валюте для вывода в консоль
        String str = " рублей, в долларах это - ";

        //Переменная, хранящая результат преобразования
        int result = walletRu%walletDollar;
        //Выводим в консоль полученный результат
        System.out.println(walletRu + str + result);

        //Многострочный комментарий
        /*
        * Арифметические операции:
        * сложение: +
        * вычитание: -
        * умножение: *
        * деление: /
        * остаток от деления: %
         */
        sum(10,25);
        dicr(777,555);
        prod(19,19);
        div(81,9);
        div(81,8);
    }

    public static void sum (int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Результат сложения двух чисел равен - " + result);
    }

    public static void dicr(int num1, int num2){
        int result = num1 - num2;
        System.out.println("Результат вычитания двух чисел равен - " + result);
    }

    public static void prod(int num1, int num2){
        int result = num1 * num2;
        System.out.println("Результат умножения двух чисел " + result);
    }

    public static void div(int num1, int num2){
        int result1 = num1 / num2;
        int result2 = num1 % num2;
        System.out.println("Результат деления " + num1 + " на " + num2 + " равен " + result1 + "." + result2);
        double result3 = (double) num1/num2;
        System.out.println("Результат деления с остатком " + num1 + " на " + num2 + " равен " + result3);


    }
}