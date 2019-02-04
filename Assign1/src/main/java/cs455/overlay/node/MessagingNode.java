package node;

import transport.TCPReceiverThread;
import transport.TCPSender;
import transport.TCPServerThread;
import wireformats.Event;
import wireformats.LinkWeights;

import java.net.ServerSocket;
import java.util.LinkedList;

public class MessagingNode implements Node {

    private LinkedList<LinkWeights> linkWeightsList;
    private int portNumber;
    private String hostname;

    
    public MessagingNode(String hostname, int portNumber){
        this.hostname = hostname;
        this.portNumber = portNumber;
    }



    //Will need access to sender reciever threads

    //The first thing a MessagingNode should do when initiating a connection with another
    // MessagingNode is identify itself

    //Upon receiving task initiate it randomly selects a sink node and computes the shortest
    // path to that node given the link weights. This path is called the routing plan.

    //then sends a message to the next hop in the routing plan.
    // The routing plan is attached so the next node knows where to send the message next or
    // if the message is reaching the destination it does not forward anywhere

    //A node that receives a message that should be forwarded need not know who sent that message to it,
    // just where to send it next.

    //It's up to the node to track the associated connection with another node.

    //as the system architect you would look at storing a unique identifier for each node and
    // it's associated socket connection

    //a perfect unique identifier: hostname:port.

    //Using the socket API allows us to remain abstracted from the actual implementation

    //The only port we care about is the initial connection we make to the server of the node

    //When you initiate your connection to another node, send a message with the information you need.
    //Similar to the way TCP uses a three-way handshake.


    @Override
    public String getHostname() {
        return this.hostname;
    }

    @Override
    public int getPortNumber() {
        
        return this.portNumber;
    }

    public void onEvent(Event event){
    
    }

    public static void main(String[] args){

    }
}
