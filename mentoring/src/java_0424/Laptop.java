package java_0424;

public class Laptop {
    private String brand;
    private int price;
    private int inch;

    public Laptop(){
    }
    public Laptop(String brand,int price,int inch){
        this.brand=brand;
        this.price=price;
        this.inch=inch;
    }

    public void print(){
        System.out.println("브랜드 :"+brand+"| 가격 : "+price+"| 인치 : "+inch);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
