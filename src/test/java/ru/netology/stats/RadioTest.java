package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {
    @Test
    public void setCurrentStationRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationOverNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationBellowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextAfterNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevPreviousZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelloZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(34);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 34;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeOver100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(34);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 34;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeRegular() {
        Radio radio = new Radio();

        radio.setCurrentVolume(34);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 35;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolumeRegular() {
        Radio radio = new Radio();

        radio.setCurrentVolume(34);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 33;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeOver100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolumeBellowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
