package java_0424.membership;

public class Silver {
    protected String name;
    protected double point;
    protected double accumulate;
    protected String rank;
    public Silver(String name){
        this.name=name;
        point = 0;
        accumulate=0.05;
        rank = "SILVER";
    }

    public int buy(int price){
        point += accumulate*price;
        return price;
    }

    public void print(){
        System.out.println("이름 : "+name);
        System.out.println("등급 : "+rank);
        System.out.println("적립율 : "+accumulate);
        System.out.println("포인트 : "+point);
    }

}
