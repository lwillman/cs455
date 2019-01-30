package node;

import wireformats.Event;

public interface Node {

    private String hostname;
    private int portNumber;

    private void setPortNumber();
    public String getHostname();
    public int getPortNumber();

    public void onEvent(Event event);
    
}
