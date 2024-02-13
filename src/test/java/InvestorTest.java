import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InvestorTest {

    Investor investor;
    Hotel hotel;
    StudentFlat studentFlat;
    Office office;
    ArrayList<Building> buildings;

    @BeforeEach
    public void setUp(){
        studentFlat = new StudentFlat(15, 2000, 800000, 15);
        buildings = new ArrayList<>(Arrays.asList(hotel, office, studentFlat));
        investor = new Investor("Elon Musk", buildings);
        hotel = new Hotel(25,2005,2000000, true, 100);
        office = new Office(5, 2010, 750000, "Tesla", 100000, 10000);
    }

    @Test
    public void canGetName(){
        investor.setName();
        assertThat(investor.getName()).isEqualTo("Elon Musk");
    }

    @Test
    public void canGetValue(){
        assertThat(investor.getBuildings()).isEqualTo(buildings);
    }

    @Test
    public void canBuyBuilding(){
        Hotel hotel = new Hotel(100, 1990, 20000000, true,  1000);
        investor.buyBuilding(hotel);
        assertThat(investor.getBuildings().size()).isEqualTo(4);
    }

    @Test
    public void canSellBuilding(){
        investor.sellBuilding(hotel);
        assertThat(investor.getBuildings().size()).isEqualTo(4);
    }



}
