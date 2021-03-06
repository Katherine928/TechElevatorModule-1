package com.techelevator;

public class Elevator {
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;


    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
    }


    public void openDoor() {
        this.doorOpen = true;
    }

    public void closeDoor() {
        this.doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if(!this.doorOpen && this.numberOfFloors >= desiredFloor && this.currentFloor < desiredFloor) {
            this.currentFloor = desiredFloor;
        }
    }

    public void goDown(int desiredFloor) {
        if(!this.doorOpen && desiredFloor > 0 && this.currentFloor > desiredFloor) {
            this.currentFloor = desiredFloor;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
