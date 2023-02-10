public class Main {
    public static void main(String[] args) {
        int account = 500; // Начальный счёт
        int amount = 1200; // Сумма пополнения

        if (amount > 1000) {
            int bonus = amount / 100;
            int score = account + amount;
            System.out.println("Итоговый счёт: " + (score + bonus));
        } else {
            System.out.println("Итоговый счёт: " + (amount + account));
        }
    }
}
