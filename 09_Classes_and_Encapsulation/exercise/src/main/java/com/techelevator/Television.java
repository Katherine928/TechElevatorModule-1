package com.techelevator;

public class Television {
    private boolean isOn;
    private int currentChannel;
    private int currentVolume;

    public Television() {
        this.isOn = false;
        this.currentChannel = 3;
        this.currentVolume = 2;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void changeChannel(int newChannel) {
        if(this.isOn && this.currentChannel >= 3 && this.currentChannel <= 18) {
            this.currentChannel = newChannel;
        }
    }

    public void channelUp() {
        if(this.isOn) {
            if (this.currentChannel < 18) {
                this.currentChannel += 1;
            } else {
                this.currentChannel = 3;
            }
        }
    }

    public void channelDown() {
        if(this.isOn) {
            if (this.currentChannel > 3) {
                this.currentChannel -= 1;
            } else {
                this.currentChannel = 18;
            }
        }
    }

    public void raiseVolume() {
        if(this.isOn) {
            if(this.currentVolume < 10) {
                this.currentVolume += 1;
            }
        }
    }

    public void lowerVolume() {
        if(this.isOn) {
            if(this.currentVolume > 0) {
                this.currentVolume -= 1;
            }
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
