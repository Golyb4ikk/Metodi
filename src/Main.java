import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //zadacha1
        int year = 44;
        uznatGod(year);
        //zadacha 2
        int clientOS = 0;
        int clientDeviceYear = 2020;
        uznatVersiu(clientOS, clientDeviceYear);
        //zadacha 3
        int deliveryDistance = 95;
        uznatDen(deliveryDistance);
    }

    public static int uznatGod(int year) {
        if (year % 4 > 0 || year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }
        return year;
    }

    public static int uznatVersiu(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear > 2015 && clientDeviceYear < 2022) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015 && clientDeviceYear < 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке!");
        }
        return clientOS + clientDeviceYear;
    }

    public static int uznatDen(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance < 20) {
            day = day + 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            day = day + 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            day = day + 3;
            System.out.println("Потребуется дней: " + day);
        }
       return deliveryDistance;
    }
}