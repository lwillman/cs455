package node;

import wireformats.Event;

import java.util.LinkedList;

public class Registry implements Node{

    private LinkedList registry;

    private String hostname;
    private int portNumber;
    private int nunmberOfMessagesSent;
    private int numberOfMessagesRecieved;

    //Each instance creates its own TCPServer/Reciever/Sender threads

    //A node receives link weights once from the registry before it gets a task initiate message.

    public Registry(){
        super();
        registry = new LinkedList<MessagingNode>();
    }

    public void setPortNumber(){
    }

    public String getHostname(){
        return null;
    }

    public int getPortNumber(){
       return 0;
    }

    private void listMessagingNodes(){
        //Hostname and port number for each messaging node should be listed on separate line
    }

    private void listWeights(){
        //Lists weight and nodes connected for each link on separate line
    }

    private void setupOverlay(int numberOfConnections){
        //Min numberOfConnections 4
        //Sets up overlay
        //Sends messaging nodes messages telling it which other nodes to connect to
        //Keeps a count of the number of connections for each node
        //Sends MESSAGING_NODE_LIST to every messaging node
        //Handles error of having fewer nodes than numberOfConnections
        //Must handle the case where a messaging node is registered/deregistered before overlay is set up
    }

    private void sendOverlayLinkWeight (){
        //Sends Link_Weights message to all registered nodes in overlay
        //Run once after setupOverlay() has been run
    }

    private void start(int numberOfRounds){
        //Results in nodes exchanging messages
        //Each node will be responding for sending Number-of-rounds messages
    }

    public void onEvent(Event event){

    }

    public void main(String[] args){

    }


}
