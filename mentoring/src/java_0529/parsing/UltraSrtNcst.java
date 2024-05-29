package java_0529.parsing;

import lombok.Data;

import java.util.List;

//Json 파싱 클래스
@Data
public class UltraSrtNcst {
    Response response;
}

@Data
class Response{
    Body body;
}
@Data
class Body{
    Items items;
}
@Data
class Items{
    List<Item> item;
}
@Data
class Item{
    String baseDate;
    String baseTime;
    String category;
    int nx;
    int ny;
    String obsrValue;
}
