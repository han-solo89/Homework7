public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println("задание 1");
    for ( int i = 1; i <= 10; i=i+1) {
        System.out.println(i);
        }
        // задание 2
        System.out.println("задание 2");
        for (int j = 10; j >=1 ; j=j-1) {
            System.out.println(j);
        }
        // задание 3
        System.out.println("задание 3");
        for (int k = 0; k < 17 ; k=k+2) {
            System.out.println(k);
        }
        // задание 4
        System.out.println("задание 4");
        for (int l = 10; l >= -10 ; l--) {
            System.out.println(l);
        }
        // задание 5
        System.out.println("задание 5");
        for (int year = 1904; year <= 2096 ; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ) {
                System.out.println(year + " год явлется високосным ");
            }
        }
        // задание 6
        System.out.println("задание 6");
        for (int i = 7; i <=98 ; i=i+7) {
            System.out.print(i + " ");
        }
        System.out.println();
        // задание 7
        System.out.println("задание 7");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();
        // задание 8
        System.out.println("задание 8");
        int part = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += part;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        // задание 9
        System.out.println("задание 9");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }
    }
}