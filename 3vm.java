import java.net.*;
import java.io.*;

public class Hello {

    public static void main(String[] args) {
        try {
    		URL url = new URL("https://petlja.org/");
    		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    		conn.setRequestMethod("GET");

    		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    		String line;

    		while ((line = rd.readLine()) != null) {
        	 	System.out.println(line);
          	}

      		rd.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
