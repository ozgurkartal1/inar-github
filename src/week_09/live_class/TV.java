package src.week_09.live_class;

public class TV {

    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    TV() {
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 120) {
            this.channel = channel;
        }
    }

    void setVolumeLevel(int volumeLevel) {
        if(on && volumeLevel >= 1 && volumeLevel <= 7){
            this.volumeLevel = volumeLevel;
        }
    }

    void channelUp() {
        if (on && channel < 120) {
            this.channel++;
        }
    }

    void channelDown() {
        if (on && channel > 1) {
            this.channel--;
        }
    }

    void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }


}
