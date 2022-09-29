public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientIOS = 0;
        int clientAndroid = 1;
        boolean identificationIOS = clientIOS < clientAndroid;
        if (identificationIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        boolean identificationAndroid = clientAndroid > clientIOS;
        if (identificationAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        int clientDeviceYear = 2015;
        int android = 0;
        int iOS = 1;
        boolean verAndroid = android < iOS;
        if (verAndroid && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        boolean verIOS = iOS > android;
        if (verIOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (verAndroid && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (verIOS && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        // Задание 3
        int year = 2100;
        if (year % 400 == 0) {
            System.out.println("Данный год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Данный год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println("Данный год является високосным");
        } else {
            System.out.println("Данный год не является високосным");
        }
        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Cрок доставки составляет сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Срок доставки составляет двое суток");
        } else {
            System.out.println("Срок доставки составляет трое суток");
        }
        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Недопустимое значение");


        }

        {








        }





        }

        }











