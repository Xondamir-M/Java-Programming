import java.time.LocalDateTime;

public class Operations {
    Account account;
    private double amount;
    private TransactionType type;
    private LocalDateTime date;

    public enum TransactionType {
        deposit,
        withdraw
    }

    public Operations(Account account, double amount, TransactionType type) {
        this.account = account;
        this.amount = amount;
        this.type = type;
        this.date = LocalDateTime.now();
    }

    public void execute() {
    }

}
