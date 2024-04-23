package java_0424.membership;

public class Gold extends Silver{
    protected int discount;

    public Gold(String name) {
        super(name);
        accumulate = 0.1;
        discount = 10;
        rank = "GOLD";
    }
    @Override
    public int buy(int price){
      point += accumulate*price;
      return price - ((price*discount)/100);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("할인율 : "+discount);
    }
}
