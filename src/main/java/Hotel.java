import Interfaces.CouncilTax;

public class Hotel extends Building implements CouncilTax {

    private boolean centralHeating;
    private int size;
    private int floors;
    public Hotel(int numberOfRooms, int dateOfConstruction, int value, boolean centralHeating, int size){
        super(numberOfRooms, dateOfConstruction, value);
        this.centralHeating = centralHeating;
        this.size = size;
        this.floors = 1;
    }

    public int countTax(){
        return this.floors * 50 * this.size;
    }

    public String addFloors(int numberOfFloors){
        if (this.floors >= 1){
            return "Operation cannot be done";
        } else {
            this.floors += numberOfFloors;
            return "Operation completed";
        }
    }

    public boolean getCentralHeating(){
        return this.centralHeating;
    }

    public void setCentralHeating(boolean centralHeating){
        this.centralHeating = centralHeating;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    public int heatingPrice(){
        if (getCentralHeating()){
            return 100;
        } else {
            return 10 * this.size;
        }
    }



}
