import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void shouldGive0forValue0() {
        //given
        int ammountOfNumbers = 0;

        //when
        Main main = new Main();
        int result = main.calculateDifference(ammountOfNumbers);

        //then
        assertThat(result, equalTo(0));

    }

    @Test
    public void shouldGive170forValue5() {
        //given
        int ammountOfNumbers = 5;

        //when
        Main main = new Main();
        int result = main.calculateDifference(ammountOfNumbers);

        //then
        assertThat(result, equalTo(170));

    }

    @Test
    public void shouldGive2640forValue10() {
        //given
        int ammountOfNumbers = 10;

        //when
        Main main = new Main();
        int result = main.calculateDifference(ammountOfNumbers);

        //then
        assertThat(result, equalTo(2640));

    }

    @Test
    public void shouldGive5434forValue12() {
        //given
        int ammountOfNumbers = 12;

        //when
        Main main = new Main();
        int result = main.calculateDifference(ammountOfNumbers);

        //then
        assertThat(result, equalTo(5434));

    }

}