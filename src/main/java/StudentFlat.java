import Interfaces.CouncilTax;

public class StudentFlat extends Building implements CouncilTax {
    private int numberOfStudents;
    private int floors;
    public StudentFlat(int numberOfRooms,
                       int dateOfConstruction,
                       int value,
                       int numberOfStudents) {
        super(numberOfRooms, dateOfConstruction, value);
        this.numberOfStudents = numberOfStudents;
        this.floors = 2;
    }

    public int countTax(){
        return this.floors * 50 * numberOfStudents;
    }

    public String addFloors(int numberOfFloors){
        if (this.floors >= 4){
            return "Operation cannot be completed : already too many floors";
        } else {
            this.floors += numberOfFloors;
            return "Operation completed";
        }
    }

    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }

    public void setNumberOfStudents(){
        this.numberOfStudents = numberOfStudents;
    }

    public void evictStudent(){
        if (numberOfStudents > 100){
            this.numberOfStudents -= 1;
        }
    }


}

