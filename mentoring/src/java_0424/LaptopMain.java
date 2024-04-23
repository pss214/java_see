package java_0424;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop lg = new Laptop("LG",1600000,40);
        Laptop samsung = new Laptop();
        samsung.setBrand("SAMSUNG");
        samsung.setPrice(1300000);
        samsung.setInch(40);
        lg.print();
        samsung.print();
    }
}
