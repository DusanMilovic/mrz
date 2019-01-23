package zad;

import java.io.*;
import java.net.*;

public class Client {
    public static String address = "https://petlja.org/";

    public static void main(String[] args) {
        try {
            URL u = new URL(address);
            BufferedReader reader = new BufferedReader(new InputStreamReader(u.openStream(),"UTF-8"));
            String s;

            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
