package util;

import java.io.*;
import java.sql.Timestamp;

public class Marshall {
    
    private int type;
    private long timestamp;
    private String identifier;
    private int tracker;
    
    public Marshall(int type, String identifier, int tracker){
        this.type = type;
        this.identifier = identifier;
        this.tracker = tracker;
        this.timestamp = new Timestamp().getTime();
    }
    
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

}
