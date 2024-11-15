package org.ies.vehicles.model;

import org.ies.vehicles.components.VehicleType;

public class Vehicle {
    private VehicleType vehicleType;
    private int maxSpeed;
    private String color;
    private String plate;

    public Vehicle(VehicleType vehicleType, String plate, String color, int maxSpeed) {
        this.vehicleType = vehicleType;
        this.plate = plate;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getPlate() {
        return plate;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }
}
