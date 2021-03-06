import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void getCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void setToMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setToMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setNextBoundaryStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    void setNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setNextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setPrevBoundaryStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void setPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setPrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setToMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setToMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setNextBoundaryVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.setNextVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.setNextVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setPrevBoundaryVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setPrevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void setPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.setPrevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}