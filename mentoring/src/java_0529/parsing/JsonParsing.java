package java_0529.parsing;

import com.google.gson.Gson;
import java_0529.DataReq;

import java.io.IOException;
import java.net.URISyntaxException;

public class JsonParsing {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DataReq dataReq = new DataReq();
        String data = dataReq.Req(61,126);

        Gson gson = new Gson();
        UltraSrtNcst json = gson.fromJson(data, UltraSrtNcst.class);
        for (Item i : json.response.body.items.item){
            System.out.println(i);
        }

    }
}
