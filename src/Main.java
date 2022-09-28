public class Main {
    static int year = 2100;
    public static void main(String[] args){
        System.out.println("Задание 1.0");
        checkingYear();
        System.out.println("Задание 2");
        enterPhoneParameters(0, 2014);
        System.out.println("Задание 3");
        exchangeOfDistanceForDays(59);



    }
    public static void checkingYear(){
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }


    }
    public static void enterPhoneParameters(int OS, int getYear){
        if (OS == 0)
            if (getYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else{
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
            if (getYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }


        }

    }
    public static void exchangeOfDistanceForDays(int deliveryDistance){
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + 1);

        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);

        }else {
            System.out.println("Потребуется дней: " + 3);
        }
    }
}
