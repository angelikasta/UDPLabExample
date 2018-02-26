package udplabexample;

import java.io.*;
import java.net.*;

public class SimpleUDPExampleClient {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        try (DatagramSocket clientSocket = new DatagramSocket()) {
            BufferedReader inFromUser
                    = new BufferedReader(new InputStreamReader(System.in));
            InetAddress IPAddress = InetAddress.getByName("localhost");
            byte[] sendData = new byte[1024];
            String sentence = inFromUser.readLine();
            sendData = sentence.getBytes();
            
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);
        }
    }
}