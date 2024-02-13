import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    public void setUp(){
        office = new Office(10, 2020, 100000, "Amazon", 10000, 1000);
    }

    @Test
    public void canSetCompanyName(){
        office.setCompanyName("Apple");
        assertThat(office.getCompanyName()).isEqualTo("Apple");
    }

    @Test
    public void canSetIncome(){
        office.setIncome(1000);
        assertThat(office.getIncome()).isEqualTo(1000);
    }

    @Test
    public void canSetExpenses(){
        office.setExpenses(100);
        assertThat(office.getExpenses()).isEqualTo(100);
    }

    @Test
    public void canCalculateProfits(){
        assertThat(office.calculateProfit()).isEqualTo(9000);
    }

}
