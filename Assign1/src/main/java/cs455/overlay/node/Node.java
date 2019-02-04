package node;

import wireformats.Event;

public interface Node {

    public String hostname = null;
    public int portNumber = 0;

    public String getHostname();
    public int getPortNumber();

    public void onEvent(Event event);
    
}
