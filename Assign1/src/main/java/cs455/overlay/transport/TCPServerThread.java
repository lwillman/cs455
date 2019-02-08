package cs455.overlay.transport;

import node.Node;
import node.Registry;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import wireformats.Register;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerThread implements Runnable{

    private Node node;

    public TCPServerThread(Node node){
        this.node = node;
    }

    @Override
    public void run() {
        ServerSocket serverSocket = node.getServerSocket();
        while(true) {
            try {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                TCPCommunicationThread commThread = new TCPCommunicationThread(this.node, socket);
                commThread.run();

                System.out.println("CommThread Successful");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //private String hostname = ServerSocket.getInetAddress().getLocalHost().getHostName();

}
