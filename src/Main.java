
public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Решение задачи 1:");

        byte clientOS = 5;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println();
        //Задание 2
        System.out.println("Решение задачи 2:");
        clientOS = 1;
        int clientDeviceYear = 2015;

        int realClientDeviceYear = 2011;

        if (clientOS == 0 && realClientDeviceYear >= clientDeviceYear ) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");}

        if (clientOS == 0 && realClientDeviceYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}

       if (clientOS == 1 && realClientDeviceYear >= clientDeviceYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");}

       if (clientOS == 1 && realClientDeviceYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}

        System.out.println();
        //Задание 3
        System.out.println("Решение задачи 3:");

        int year = 2021;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " год является високосным");
        }
        else {System.out.println(year + " год не является високосным");}

        System.out.println();
        //Задание 4
        System.out.println("Решение задачи 4:");

        int deliveryDistance = 95;
        int days = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);}

        if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Потребуется дней: " + (days + 1));}

        if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + (days + 2));}


        System.out.println();
        //Задание 5
        System.out.println("Решение задачи 5:");

        int monthNumber = 12;

        if (monthNumber >=1 && monthNumber <=12) {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - осень");
                break;}
        } else   {System.out.println("Месяц года указан некорректно");}




    }
}

