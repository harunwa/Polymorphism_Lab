import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    StudentFlat studentFlat;

    @BeforeEach
    public void setUp(){
        studentFlat = new StudentFlat(20,2010, 500000, 20);
    }

    @Test
    public void canEvictStudent(){
        studentFlat.evictStudent();
        assertThat(studentFlat.getNumberOfStudents()).isEqualTo(20);
    }

    @Test
    public void canAddFloors(){
        assertThat(studentFlat.addFloors(1)).isEqualTo("Operation completed");
    }

    @Test
    public void canCalculateCouncilTax(){
        assertThat(studentFlat.countTax()).isEqualTo(2000);
    }

}
