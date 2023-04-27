public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         int clientOS = 0;
         if (clientOS == 0){
             System.out.println("Install version of the app for iOS and follow the link");
         } else System.out.println("Install version of the app for Android and follow the link");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        int clientOS = 0;
        if (clientOS == 0){
            if (clientDeviceYear < 2015){
                System.out.println("Install the light version of the app for iOS and follow the link");
            } else {
                System.out.println("Install version of the app for iOS and follow the link");
            }
        } else if (clientDeviceYear < 2015){
            System.out.println("Install the light version of the app for Android and follow the link");
        } else {
            System.out.println("Install version of the app for Android and follow the link");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
    int year = 2000;
    if (year % 400 == 0){
        System.out.println(year + " is a leap year");
    } else if (year % 4 == 0) {
        if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else {
            System.out.println(year + " is a leap year");
        }
    } else System.out.println(year + " is not a leap year");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Delivery time: 1 day");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Delivery time: 2 days");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Delivery time: 3 days");
        } else System.out.println("No delivery");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                break;
        }
    }
}