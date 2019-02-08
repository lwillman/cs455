package wireformats;

import java.io.*;

public class WireFormatItem {
    
    private int type;
    private long timestamp;
    private String identifier;
    private int tracker;

    /**
     * Constructor that unmarshalls bytes
     * @param marshalledBytes byte array
     * @throws IOException
     */
    public WireFormatItem(byte[] marshalledBytes) throws IOException {
        ByteArrayInputStream baInputStream =
                new ByteArrayInputStream(marshalledBytes);
        DataInputStream din =
                new DataInputStream(new BufferedInputStream(baInputStream));
        type = din.readInt();
        timestamp = din.readLong();
        int identifierLength = din.readInt();
        byte[] identifierBytes = new byte[identifierLength];
        din.readFully(identifierBytes);
        identifier = new String(identifierBytes);
        tracker = din.readInt();
        baInputStream.close();
        din.close();
    }

    /**
     * Getter Type
     * @return int type code
     */
    public int getType(){
        return this.type;
    }

    /**
     * getter timestamp
     * @return long timestamp
     */
    public long getTimestamp(){
        return this.timestamp;
    }

    /**
     * getter identifier
     * @return String indentifier
     */
    public String getIdentifier(){
        return this.identifier;
    }

    /**
     * getter tracker
     * @return int tracker
     */
    public int getTracker(){
        return this.tracker;
    }

    /**
     * Getter for byte array, Marshalls
     * @return byte array
     * @throws IOException
     */
    public byte[] getBytes() throws IOException {
        byte[] marshalledBytes = null;
        ByteArrayOutputStream baOutputStream = new ByteArrayOutputStream();
        DataOutputStream dout =
                new DataOutputStream(new BufferedOutputStream(baOutputStream));
        dout.writeInt(type);
        dout.writeLong(timestamp);
        byte[] identifierBytes = identifier.getBytes();
        int elementLength = identifierBytes.length;
        dout.writeInt(elementLength);
        dout.write(identifierBytes);
        dout.writeInt(tracker);
        dout.flush();
        marshalledBytes = baOutputStream.toByteArray();
        baOutputStream.close();
        dout.close();
        return marshalledBytes;
    }

}
