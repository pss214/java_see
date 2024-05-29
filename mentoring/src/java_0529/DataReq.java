package java_0529;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class DataReq {

        //날씨정보(옛이름 동네날씨) (매개변수- 위도,경도)
        public String Req(int x, int y) throws IOException, URISyntaxException {

            //API 서버 URL 설정
            String urlReq = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?" +
            "serviceKey"+ "=서비스키"+ /*Service Key*/
            "&pageNo=" + "1" + /*페이지번호*/
            "&numOfRows=" + "1000" + /*한 페이지 결과 수*/
            "&dataType=" + "JSON" + /*요청자료형식(XML/JSON) Default: XML*/
            "&base_date=" + "20240526" + /*‘24년 5월 26일 발표*/
            "&base_time=" + "0600" + /*06시 발표(정시단위) */
            "&nx=" + x + /*예보지점의 X 좌표값*/
            "&ny=" + y; /*예보지점의 Y 좌표값*/

            //API 서버 연결 코드
            URL url = new URI(urlReq).toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            // http status 200~300 사이인 경우 연결 성공한 코드
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                //API 서버의 응답 데이터
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }
            // http status 400 이상인 경우 연결 실패한 코드
            else {
                //API 서버의 응답 데이터
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            // 응답 데이터 리턴
            return sb.toString();
        }
}
