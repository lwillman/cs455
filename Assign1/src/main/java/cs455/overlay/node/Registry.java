package node;

import util.RegistrationRequest;
import wireformats.Event;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Registry implements Node{

    private LinkedList registry;

    private String hostname;
    private int portNumber;
    private int nunmberOfMessagesSent;
    private int numberOfMessagesRecieved;
    private ServerSocket serversocket;


    //Each instance creates its own TCPServer/Reciever/Sender threads

    //A node receives link weights once from the registry before it gets a task initiate message.

    public Registry(int portNumber){
        this.portNumber = portNumber;
    }


    public String getHostname(){
        return this.hostname;
    }

    public int getPortNumber(){
       return this.portNumber;
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
        try {
            serversocket = new ServerSocket(numberOfConnections, this.portNumber);
            System.out.println("Server is listening on port " + this.portNumber);

            while(true) {

                Socket socket = serversocket.accept();
                System.out.println("New client connected");

                Thread registryThread = new Thread();
                DataInputStream din = new DataInputStream(socket.getInputStream());
                DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

            }
        } catch(BindException be){
            System.out.println("Bind exception: " + be.getMessage());
        } catch (IOException ioe){
            System.out.println("IO Exception " + ioe);
        }
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
        Registry registry = new Registry(5000);
        //registry.setupOverlay();


    }


}
