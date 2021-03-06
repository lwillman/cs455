package cs455.overlay.node;

import cs455.overlay.wireformats.Event;

import java.net.ServerSocket;
import java.net.Socket;

public interface Node {

    public String hostname = null;
    public int portNumber = 0;
    public ServerSocket serverSocket = null;

    public String getHostname();
    public int getPortNumber();
    public ServerSocket getServerSocket();

    public void onEvent(Event event);
    
}
