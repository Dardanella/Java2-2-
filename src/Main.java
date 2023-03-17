public class Main {
    public static void main(String[] args) {
        System.out.println("Рассчитываем бонусы");
        int shag = 100;
        int balans = 300;
        int summaPopolneniya = 1000;
        int popolneniySchet = balans + summaPopolneniya;

        int bonus;
        if (popolneniySchet > 1000) {
            bonus = popolneniySchet / shag;
        } else {
            bonus = 0;

            }
            System.out.println("Бонусов:" + bonus);

    }
}