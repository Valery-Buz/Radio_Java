public class Radio {

    private int currentStation;
    private int numberOfStations = 10;
    private int maxStation = numberOfStations - 1;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= numberOfStations) {
            return;
        }
        if (currentStation <= 0) {
            return;
        }

        this.currentStation = currentStation;
    }

    public int setMaxStation() {

        return numberOfStations - 1;

    }

    public int setToMinStation() {

        return minStation;
    }


    public void setNextStation() {
        if (currentStation < numberOfStations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public void setPrevStation() {

        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = numberOfStations - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int setToMaxVolume() {

        return maxVolume;
    }

    public int setToMinVolume() {

        return minVolume;
    }

    public void setNextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }

    }

    public void setPrevVolume() {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }
}