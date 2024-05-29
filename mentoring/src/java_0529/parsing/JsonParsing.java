package java_0529.parsing;

import com.google.gson.Gson;
import java_0529.DataReq;

import java.io.IOException;
import java.net.URISyntaxException;

public class JsonParsing {
    public static void main(String[] args) throws IOException, URISyntaxException {

        //API 서버 연결 객체 생성
        DataReq dataReq = new DataReq();
        // 좌표값 넣어 함수 실행.
        String data = dataReq.Req(61,126);
        //Json 파싱 Gson 객체 생성
        Gson gson = new Gson();
        //파싱 클래스 생성하여 Gson을 통해 객체 생성
        UltraSrtNcst json = gson.fromJson(data, UltraSrtNcst.class);
        for (Item i : json.response.body.items.item){
            System.out.println(i);
        }

    }
}
