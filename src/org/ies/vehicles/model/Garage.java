package org.ies.vehicles.model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {

    private String nombre;
    private String direction;
    private Vehicle[] vehicles;

    public Garage(String nombre, String direction, Vehicle[] vehicles) {
        this.nombre = nombre;
        this.direction = direction;
        this.vehicles = vehicles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(nombre, garage.nombre) && Objects.equals(direction, garage.direction) && Objects.deepEquals(vehicles, garage.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direction, Arrays.hashCode(vehicles));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "nombre='" + nombre + '\'' +
                ", direction='" + direction + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}
