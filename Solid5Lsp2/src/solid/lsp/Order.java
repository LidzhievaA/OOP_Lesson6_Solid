package solid.lsp;

public class Order extends OrderAbstract{


    public Order(int qnt, int price) {
        super(price, qnt);
    }

    public int getAmount() {
        return super.qnt * super.price;
    }


}
