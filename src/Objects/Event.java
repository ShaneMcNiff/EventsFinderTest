
package Objects;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Event {
    private int identifier;
    private int tickets;
    private double priceFirst;
    private double priceSecond;
    private int xLoc;
    private int yLoc;
    private int distanceFromPoint;
    
    public Event(){}
    
    //Setting random values for everything
    public Event(int identifier){
        this.identifier = identifier;
        this.tickets =(int)(Math.random() * 100);
        this.priceFirst = (double)(Math.random() * 49 + 20);
        this.priceSecond = (double)(Math.random() * 49 + 20);
        this.xLoc = (int)((Math.random() * 20) - 10);
        this.yLoc = (int)((Math.random() * 20) - 10);
    }
    
    //Setting the random location on start
    public void setRandomLoc(){
        this.xLoc = (int)((Math.random() * 20) - 10);
        this.yLoc = (int)((Math.random() * 20) - 10);
    }
 
    
    //Standard get and set methods
    public int getXLoc(){
        return this.xLoc;
    }
    public int getYLoc(){
        return this.yLoc;
    }
    public double getPriceFirst(){
        return this.priceFirst;
    }
    public double getPriceSecond(){
        return this.priceSecond;
    }
    public int getIdentifier(){
        return this.identifier;
    }
    public int getTickets(){
        return this.tickets;
    }
    public int getDistance(){
        return this.distanceFromPoint;
    }
    
    public void setXLoc(int xLoc){
        this.xLoc = xLoc;
    }
    public void setYLoc(int yLoc){
        this.yLoc = yLoc;
    }
    public void setTickets(int tickets){
        this.tickets = tickets;
    }
    public void setPriceFirst(double price){
        this.priceFirst = price;
    }
    public void setPriceSecond(double price){
        this.priceFirst = price;
    }
    public void setIdentifier(int identifier){
        this.identifier = identifier;
    }
    public void setDistance(int distance){
        this.distanceFromPoint = distance;
    }
 
    //Simple printing method
    public void printEventDetails(int identifier){
        DecimalFormat df = new DecimalFormat("#.##"); //Makes the double only have two places after the decimal point
        df.setRoundingMode(RoundingMode.CEILING); //Makes sure that it is always rounding up
        double cheapestPrice = 0;
        if(this.priceFirst < this.priceSecond)
            cheapestPrice = this.priceFirst;
        else
            cheapestPrice = this.priceSecond;
        System.out.println("Event : " + this.identifier + " Price : $" + df.format(cheapestPrice) +  " Distance : " + this.distanceFromPoint);
    }
}
