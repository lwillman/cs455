package cs455.overlay.util;

public class RegistrationRequest {

    private int REGISTER_REQUEST;
    private String IPAddress;
    private int portNumber;

    public RegistrationRequest(int messageType, String ipAddr, int portNum){
        this.REGISTER_REQUEST = messageType;
        this.IPAddress  = ipAddr;
        this.portNumber = portNum;
    }

}
