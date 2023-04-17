package seminars.seminar6.Solid5Lsp2.src.solid.lsp;

public class Order extends Orderable{
    private int price;
    private int qnt;

    public Order(int qnt, int price) {
        super(qnt, price);
        this.price = price;
        this.qnt = qnt;
    }

    public int getAmount() {
        return qnt * price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
