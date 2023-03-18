public class Main {
    public static void main(String[] args) {
        System.out.println("Рассчитываем бонусы");
        int step = 100;
        int balance = 300;
        int recharge = 1000;
        int account = balance + recharge;

        int bonus;
        if (account > 1000) {
            bonus = account / step;
        } else {
            bonus = 0;

        }
        System.out.println("Бонусов:" + bonus);

    }
}