package Main;
import Objects.World;
import Objects.Event;
import java.util.ArrayList;
import java.util.Scanner;

public class Run{
    
    World world = new World();
    
    public static void main(String[]args){
    
        System.out.println("Please enter two coordinates");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a x coordinate : ");
        int x = sc.nextInt();
        System.out.println("Enter a y coordinate : ");
        int y = sc.nextInt();
        System.out.println("\n");

        //Creating the world
        World world = new World();
        
        //Creating the events list, probably could have just done this in the World objects constructor either
        world.createEventsList();
        
        //The distance is calcuated after the events are created, and are then assigned to each event
        calculateManhattenDistance(x, y, world);
        
        //Print out the end results
        world.printEventsList();
    }

    public static void calculateManhattenDistance(int xCor, int yCor, World world){
        ArrayList<Event> eventsList = world.getEventsList();
        
        for(int i = 0; i < eventsList.size(); i++){
            int distance = Math.abs(xCor - eventsList.get(i).getXLoc()) + Math.abs(yCor - eventsList.get(i).getYLoc());//Calculating the manhattan distance, have used this formula while studying AI before
            eventsList.get(i).setDistance(distance);//Set the distance from the point to each event
        }
       
        //Using bubble sort to sort the events array in order of closest events first
        //There is an enhanced way of doing this with arraylists using collections.sort but 
        //takes a bit of back work for custom objects, seemed a bit overkill for this particular problem
        for(int i = 0; i < eventsList.size(); i++){
            for(int j = 1; j < eventsList.size() - i; j++){
                if(eventsList.get(j-1).getDistance() > eventsList.get(j).getDistance()){
                    Event temp = eventsList.get(j-1);
                    eventsList.set(j-1, eventsList.get(j));
                    eventsList.set(j, temp);
                }
            }
        }
    }
}
