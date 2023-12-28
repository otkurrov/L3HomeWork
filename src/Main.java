public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);

        try {
            while (true) {
                account.withDraw(6000);
            }
        } catch (LimitException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Remaining amount: " + e.getRemainingAmount());
        }
    }
}