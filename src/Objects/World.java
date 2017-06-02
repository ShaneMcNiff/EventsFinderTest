
package Objects;

import java.util.ArrayList;

public class World {
    
    private ArrayList<Event> eventsList = new ArrayList<Event>();
    
    
    public World(){}
    
    //Method to create the list of events
    public void createEventsList(){
        Event firstEvent = new Event(1);//This is just to make the first event identifier be 1, could have just used i + 1 either
        eventsList.add(firstEvent);
        for(int i = 2; i < 11; i++){//I have decided to create ten events in the world
            Event event = new Event(i);
            if(!isCoorFree(event))//Have to check that the coordinates that have just been randomly generated are free
                while(isCoorFree(event))
                    event.setRandomLoc();
            eventsList.add(event);
        }
    }
    
    //Prints the five closest events using events.printEventDetails() method
    public void printEventsList(){
        int i = 0;
        while (i < 5){
            eventsList.get(i).printEventDetails(i);
            i++;
        }
    }
    
    //Standard get method
    public ArrayList<Event> getEventsList(){
        return eventsList;
    }
    
    //This method is used to determine if there is already an event on in the supplied location
    public boolean isCoorFree(Event event){
        int i = 0;
        while(i < eventsList.size()){
            if(event.getXLoc() == eventsList.get(i).getXLoc() && event.getYLoc() == eventsList.get(i).getYLoc())
                return false;
            i++;
        }
        return true;
    }
}
