public class Main {
    public static void main(String[] args) {
        int start_bill = 200;
        int refill = 3600;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваша сумма пополнения " + refill + " Ваши бонусы " + bonus + " Ваш баланс " + (start_bill + refill + bonus));
    }
}