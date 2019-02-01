package node;

import wireformats.Event;

public interface Node {

    public void setPortNumber();
    public String getHostname();
    public int getPortNumber();

    public void onEvent(Event event){
    
    }
    
}
