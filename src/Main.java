import java.time.LocalDate;

public class Main {
    //Task 1
    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void main(String[] args) {

        //task 1
        int year = 2024;
        printIsLeapYear(year);

        //task 2

        String name = "Android";
        int yearDevise = 2020;
        getClientOsAbdYear(name, yearDevise);

        //task 3
        int deliveryDistance = 70;
        getDistance(deliveryDistance);
    }
    // Task 2

    public static int getClientOsAbdYear(String name, int yearDevise) {

        int currentYear = LocalDate.now().getYear();
        String version = yearDevise < currentYear ? "облегченную" : "";

        if (name.equals("iOS") && yearDevise < currentYear) {
            System.out.printf("Установите %s версию приложения для iOS по ссылке \n", version);
            return 0;
        } else if (name.equals("iOS") && yearDevise > currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
            return 0;
        } else if (name.equals("Android") && yearDevise < currentYear) {
            System.out.printf("Установите %s версию приложения для Android по ссылке \n", version);
            return 1;
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
            return 1;
        }

    }

    // Task 3
    public static void getDistance(int deliveryDistance) {

        if (deliveryDistance <= 20) { //диапазон доставки
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {  //диапазон доставки
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {  //диапазон доставки
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }

    }


}
