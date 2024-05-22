package java_0522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("홍길동전","허균");
        Book book2 = new Book("피노키오","카를로 콜로디");
        Book book3 = new Book("콩쥐팥쥐","미상");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book b : books){
            b.print();
        }

        books.remove(1);
        System.out.println("============================");
        for (Book b : books){
            b.print();
        }

        List<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie("범죄도시4","허명행");
        Movie movie2 = new Movie("파묘","장재현");
        Movie movie3 = new Movie("서울의 봄", "김성수");

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        //movies.add(book1); Movie형 리스트이기 때문에 추가 불가.
    }
}
