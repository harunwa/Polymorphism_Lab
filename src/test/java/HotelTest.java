import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HotelTest {

    Hotel hotel;

    @BeforeEach
    public void setUp(){
        hotel = new Hotel(50, 1980, 1000000, false, 100);
    }

    @Test
    public void canGetSize(){
        hotel.setSize(10);
        assertThat(hotel.getSize()).isEqualTo(10);
    }

    @Test
    public void canGetCentralHeating(){
        assertThat(hotel.getCentralHeating()).isEqualTo(false);
    }

    @Test
    public void canSetCentralHeating(){
        hotel.setCentralHeating(true);
        assertThat(hotel.getCentralHeating()).isEqualTo(true);
    }

    @Test
    public void canGetHeatingPrice(){
        assertThat(hotel.heatingPrice()).isEqualTo(1000);
    }


}