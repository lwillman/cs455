package transport;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPSender {
    
    private Socket socket;
    private DataOutputStream dataOut;
    
    public TCPSender(Socket socket) throws IOException{
        this.socket = socket;
        dataOut = new DataOutputStream(socket.getOutputStream());
    }
    
    public void sendData(byte[] dataToSend) throws IOException{
        int dataLength = dataToSend.length;
        dataOut.writeInt(dataLength);
        dataOut.write(dataToSend, 0, dataLength);
        dataOut.flush();
    }
}
