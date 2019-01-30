package wireformats;

public class MassagingNodesList {

    /**When a node receives a MESSAGING_NODES_LIST packet, it establishes connections with all nodes specified.
     * It knows itself, so it knows the hostname:port pair that is on one end of the connection, and it knows
     * the hostname:port pair that it is establishing the connection with.
     * The port used by the connecting node is not the same as the one that the connecting node is hosting a
     * server socket(it can't use the same port for both), so the node that is having the connection established
     * with it has no way to determine the port.
     * The hostname:port pair of the node that initiated the connection is needed to identify the link weight in
     * the subsequent LINK_WEIGHTS message, and to know how to route the packet.*/
}
