class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Deposited: " + sum);
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Withdrawal amount exceeds the balance", amount);
        } else {
            amount -= sum;
            System.out.println("Withdrawn: " + sum);
        }
    }
}