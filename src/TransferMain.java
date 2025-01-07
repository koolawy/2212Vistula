public class TransferMain {
    public static void main(String[] args) {
        Account account = new Account("Małgorzata Baranowska", 1000, "12345678901234567890123456");

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Your current balance: " + account.getBalance() + " PLN");
        }
    }
}