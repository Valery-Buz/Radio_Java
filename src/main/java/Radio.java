public class Radio {

    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        maxStation = 9;
        minStation = 0;
        if (CurrentStation < minStation) {
            return;
        }
        if (CurrentStation > maxStation) {
            return;
        }

        this.currentStation = CurrentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }


    public void setNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }
    public void setPrevStation() {

        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        maxVolume = 10;
        minVolume = 0;
        if (CurrentVolume < minVolume) {
            return;
        }
        if (CurrentVolume > maxVolume) {
            return;
        }

        this.currentVolume = CurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
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
