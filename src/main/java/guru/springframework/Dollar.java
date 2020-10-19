package guru.springframework;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplicator) {
        return new Dollar(amount*multiplicator);
    }
}
