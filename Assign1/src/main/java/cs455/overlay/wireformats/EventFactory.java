package wireformats;

public class EventFactory {

    //takes messages and turns them into events to be handled
    private static EventFactory ourInstance = new EventFactory();
    
    public static EventFactory getInstance() {
        return ourInstance;
    }
    
    private EventFactory() {
    }
}
