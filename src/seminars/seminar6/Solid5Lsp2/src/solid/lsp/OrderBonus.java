package seminars.seminar6.Solid5Lsp2.src.solid.lsp;

public class OrderBonus extends Orderable{

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }
    @Override
    public String toString() {
        return String.format("Бонус\n Количество = %d, Цена = %d", qnt, price);
    }
}
