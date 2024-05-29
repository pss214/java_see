package java_0529.parsing;

import com.google.gson.Gson;
import java_0529.DataReq;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class JsonParsing {
    public static void main(String[] args) throws IOException, URISyntaxException {

        //API 서버 연결 객체 생성
        DataReq dataReq = new DataReq();
        // 좌표값 넣어 함수 실행.
        String data = dataReq.Req(61,126);
        //Json 파싱 Gson 객체 생성
        Gson gson = new Gson();
        System.out.println(data);
        //파싱 클래스 생성하여 Gson을 통해 객체 생성
        UltraSrtNcst json = gson.fromJson(data, UltraSrtNcst.class);
        List<Item> item = json.response.body.items.item;
        for (Item i : item){
            switch (i.category){
                case "T1HH":
                    System.out.println("기온 : " + i.obsrValue);
                    break;
                case "RN1":
                    System.out.println("1시간 강수량 : " + i.obsrValue);
                    break;
                case "UUU":
                    System.out.println("동서바람성분 : " + i.obsrValue);
                    break;
                case "VVV":
                    System.out.println("남북바람성분 : " + i.obsrValue);
                    break;
                case "REH":
                    System.out.println("습도 : " + i.obsrValue);
                    break;
                case "PTY":
                    System.out.println("강수형태 : " + i.obsrValue);
                    break;
                case "VEC":
                    System.out.println("풍향 : " + i.obsrValue);
                    break;
                case "WSD":
                    System.out.println("풍속 : " + i.obsrValue);
                    break;
                default:
                    break;
            }
        }
    }
}
