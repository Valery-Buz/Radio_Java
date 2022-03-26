import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();


    @Test
    void setNumberOfStations() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(10);

        int expected = 20;
        int actual = radio.getNumberOfStations();

        assertEquals(expected, actual);

    }
    @Test
    void shouldShowTheNumberOfStations() {
        Radio radio= new Radio();

        int expected = 10;
        int actual = radio.getNumberOfStations();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentStation() {

        radio.setCurrentStation(10);
        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void setToMaxStation() {

        radio.setCurrentStation(5);

        radio.setMaxStation();

        int expected = 9;
        int actual = radio.setMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    void setToMinStation() {

        radio.setCurrentStation(5);

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.setToMinStation();

        assertEquals(expected, actual);
    }

    @Test
    void setNextBoundaryStation() {

        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    void setNextStation() {

        radio.setCurrentStation(8);
        radio.setNextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setPrevBoundaryStation() {

        radio.setCurrentStation(0);

        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void setPrevStation() {

        radio.setCurrentStation(9);

        radio.setPrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {

        radio.setCurrentVolume(101);
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setToMaxVolume() {

        radio.setCurrentVolume(50);

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.setToMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setToMinVolume() {

        radio.setCurrentVolume(50);

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.setToMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setNextBoundaryVolume() {

        radio.setCurrentVolume(100);

        radio.setNextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setNextVolume() {

        radio.setCurrentVolume(99);

        radio.setNextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setPrevBoundaryVolume() {

        radio.setCurrentVolume(0);

        radio.setPrevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setPrevVolume() {

        radio.setCurrentVolume(1);

        radio.setPrevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}