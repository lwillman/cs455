package transport;

public class TCPServerThread {
    
    
    private Node node;
    private Thread serverThread;
    private Socket socket;
    
    public TCPServerThread(Node node, Socket socket){
        this.node = node;
        this.socket = socket;
        serverThread = new Thread(node);
    }
    
    public Thread getServerThread(){
        return this.serverThread;
    }
    
    public void start(){
        serverThread.start();
    }
    
    
    
    //ServerSocket.getInetAddress().getLocalHost().getHostName(); to get HostName

}
