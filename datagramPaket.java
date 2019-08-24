import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class datagram {
	public static void main(String[] args) throw SocketException {
		String s = "Домовина се брани лепотом, и чашћу и знањем. Домовина се брани животом и лепим васпитањем."
		try {
			// u DATAGRAM mozemo da trpamo samo bajtove, ne string
			byte[] data = s.getBytes("UTF-8");
			try (DatagramSocket socket = new DatagramSocket(0)) {
				InetAddress ia = InetAddress.getByName("192.168.8.255");
				int port = 1056;
				DatagramPacket datagramPaket = new DatagramPacket(data, data.length, ia, port);
				socket.send(datagramPaket);
			} catch (UnknownHostException uex) {
				System.err.println(uex);
			} catch (IOException ioex) {
				System.err.println(ioex);
			}
		} catch (UnsupportedEncodingException err) {
			System.err.println(err);
		}
	}
}