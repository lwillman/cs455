package transport;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class TCPReceiverThread implements Runnable{

    //pass messages to EventFactory to be turned into events

    //Threads pass data by keeping reference to object in another thread
    //Use getters/Setters of the obj to share and retrieve data
    //Make most/all instance variables private
    
    private Socket socket;
    private DataInputStream dataIn;
    
    public TCPReceiverThread(Socket socket) throws IOException{
        this.socket = socket;
        dataIn = new DataInputStream(socket.getInputStream());
    }
    
    public void run(){
        int dataLength;
        while (socket != null){
            try {
                dataLength = dataIn.readInt();
                
                byte[] data = new byte[dataLength];
                dataIn.readFully(data, 0, dataLength);
            } catch (SocketException se){
                System.out.println(se.getMessage());
                break;
            } catch (IOException ioe){
                System.out.println(ioe.getMessage());
                break;
            }
        }
    }
}
