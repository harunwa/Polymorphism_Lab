import java.util.ArrayList;

public class Investor {

    private String name;
    private ArrayList<Building> buildings;

    public Investor(String name, ArrayList< Building> buildings){
        this.name = name;
        this.buildings = buildings;
    }

    public void buyBuilding(Building building){
        this.buildings.add(building);
    }

    public void sellBuilding(Building building){
        this.buildings.add(building);
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public ArrayList<Building> getBuildings(){
        return this.buildings;
    }

    public void setBuildings(ArrayList<Building> buildings){
        this.buildings = buildings;
    }

}
