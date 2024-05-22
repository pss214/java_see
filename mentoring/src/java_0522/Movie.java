package java_0522;

public class Movie {
    private String name;
    private String director;

    public Movie(String name, String director){
        this.name=name;
        this.director=director;
    }

    public void print(){
        System.out.println("영화 제목 : "+name+", 작가 : "+director);
    }
}
