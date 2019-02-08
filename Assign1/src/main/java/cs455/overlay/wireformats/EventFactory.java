package wireformats;

public class EventFactory implements Event {

    private static EventFactory ourInstance = new EventFactory();

    private EventFactory () {

    }

    //takes messages and turns them into events to be handle
    
    public static EventFactory getInstance() {
        return ourInstance;
    }


    @Override
    public void getType() {


    }

    @Override
    public void getBytes() {

    }
}
