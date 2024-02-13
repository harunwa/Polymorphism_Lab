import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuildingTest {

    Building hotel;

    @BeforeEach
    public void setUp(){
        hotel = new Hotel (10,2010, 1000000, false, 5);
    }

    @Test
    public void canCalculateAge(){
        hotel.calculateAge();
        LocalDate currentDate = LocalDate.now();
        int result = currentDate.getYear() - hotel.getDateOfConstruction();
        assertThat(hotel.calculateAge()).isEqualTo(result);
    }

    @Test
    public void canGetNumberOfRooms(){
        hotel.setNumberOfRooms(5);
        assertThat(hotel.getNumberOfRooms()).isEqualTo(5);
    }

    @Test
    public void canGetDateOfConstruction(){
        hotel.setDateOfConstruction(2000);
        assertThat(hotel.getDateOfConstruction()).isEqualTo(2000);
    }

    @Test
    public void canGetValue(){
        hotel.setValue(200000);
        assertThat(hotel.getValue()).isEqualTo(200000);
    }

}
