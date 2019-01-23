import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.net.*;
import java.io.*;

public class Main {

    private final static int PORT = 0;

    static String s="Домовина се брани лепотом, и чашћу и знањем. Домовина се брани животом и лепим васпитањем. Домовина се брани цветом, И пчелом на цвету, Маком и сунцокретом,И птицом у лету.";

    public static void main(String[] args) {

        try (DatagramSocket socket = new DatagramSocket(0)) {
            socket.setSoTimeout(10000);
            byte[] data=s.getBytes("UTF-8");
            InetAddress ia = InetAddress.getByName("255.255.255.255");
            DatagramPacket dp = new DatagramPacket(data, data.length, ia , PORT);

            socket.send(dp);


        }catch(UnknownHostException e){
        System.err.println(e);
    }
        catch ( IOException | RuntimeException ex) {
            ex.printStackTrace();
            System.out.println(" ");
        }
    }

}
