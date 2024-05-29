package java_0529;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class DataReq {
        public String Req(int x, int y) throws IOException, URISyntaxException {
            String urlReq = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?" +
            "serviceKey"+ "=서비스키"+ /*Service Key*/
            "&pageNo=" + "1" + /*페이지번호*/
            "&numOfRows=" + "1000" + /*한 페이지 결과 수*/
            "&dataType=" + "JSON" + /*요청자료형식(XML/JSON) Default: XML*/
            "&base_date=" + "20240526" + /*‘24년 5월 26일 발표*/
            "&base_time=" + "0600" + /*06시 발표(정시단위) */
            "&nx=" + x + /*예보지점의 X 좌표값*/
            "&ny=" + y; /*예보지점의 Y 좌표값*/

            System.out.println(urlReq);
            URL url = new URI(urlReq).toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            return sb.toString();
        }
}
