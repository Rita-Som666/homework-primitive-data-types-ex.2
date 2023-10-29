public class Main {
    public static void main(String[] args) {
        int bill1 = 200;
        int bill2 = 3600;
        int bonus;
        if (bill2 > 1000) {
            bonus = bill2 / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваша сумма пополнения " + bill2 + " Ваши бонусы " + bonus + " Ваш баланс " + (bill1 + bill2 + bonus));
    }
}