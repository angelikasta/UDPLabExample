package udplabexample;

import java.io.IOException;
import java.net.*;

public class SimpleUDPExampleServer {

    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        serverSocket.receive(receivePacket);
        String sentence = new String(receivePacket.getData());
        System.out.println("RECEIVED: " + sentence);
    }
}
