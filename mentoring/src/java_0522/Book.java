package java_0522;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author){
        this.name=name;
        this.author=author;
    }
    public void print(){
        System.out.println("책 제목 : "+name+", 작가 : "+author);
    }
}
