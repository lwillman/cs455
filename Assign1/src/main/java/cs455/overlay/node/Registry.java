package node;

import wireformats.Event;

public class Registry implements Node{

    private LinkedList registry;
    //Each instance creates its own TCPServer/Reciever/Sender threads

    //A node receives link weights once from the registry before it gets a task initiate message.

    public Registry(){
        super();
        registry = new LinkedList<MassagingNode>;
    }

    private void setPortNumber(){

    }

    public String getHostname(){
        return null;
    }

    public int getPortNumber(){
       return 0;
    }

    private listMessagingNodes(){
        //Hostname and port number for each messaging node should be listed on separate line
    }

    private listWeights(){
        //Lists weight and nodes connected for each link on separate line
    }

    private setupOverlay(int numberOfConnections){
        //Min numberOfConnections 4
        //Sets up overlay
        //Sends messaging nodes messages telling it which other nodes to connect to
        //Keeps a count of the number of connections for each node
        //Sends MESSAGING_NODE_LIST to every messaging node
        //Handles error of having fewer nodes than numberOfConnections
        //Must handle the case where a messaging node is registered/deregistered before overlay is set up
    }

    private sendOverlayLinkWeight (){
        //Sends Link_Weights message to all registered nodes in overlay
        //Run once after setupOverlay() has been run
    }

    private start(int numberOfRounds){
        //Results in nodes exchanging messages
        //Each node will be responding for sending Number-of-rounds messages
    }

    public void onEvent(Event event){

    }


}
