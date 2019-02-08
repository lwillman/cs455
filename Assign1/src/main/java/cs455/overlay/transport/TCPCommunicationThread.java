package cs455.overlay.transport;

import cs455.overlay.node.Node;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPCommunicationThread implements Runnable {

    private Socket socket;
    private Node node;

    public TCPCommunicationThread(Node node, Socket socket){
        this.node = node;
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

            System.out.println("input output streams started");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
