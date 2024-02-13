public class Office extends Building{
    private String companyName;
    private int income;
    private int expenses;
    private int floors;

    public Office(int numberOfRooms,
                  int dateOfConstruction,
                  int value,
                  String companyName,
                  int income,
                  int expenses){
        super(numberOfRooms, dateOfConstruction, value);
        this.companyName = companyName;
        this.income = income;
        this.expenses = expenses;
        this.floors = 5;
    }

    public String addFloors(int numberOfFloors){
        return "Cannot be done due to too many floors existing already";
    }
    public int calculateProfit(){
        return this.income - this.expenses;
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public int getIncome(){
        return this.income;
    }

    public void setIncome(int income){
        this.income = income;
    }

    public int getExpenses(){
        return this.expenses;
    }

    public void setExpenses(int expenses){
        this.expenses = expenses;
    }
}
