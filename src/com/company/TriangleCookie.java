package com.company;

import java.util.Objects;
/*
 * Classname : Inheritance
 *
 * 8 June 2020
 *
 * Copyright Vasylkivska Kateryna KNTEU
 *
 * Module 2 task 1
 *
 * Inheritance

  2. Create another class as a super class for your one.  Or create a daughterly class for your one.
*/

public class TriangleCookie extends RectangularTriangle{
    String name;
    String manufacturer;
    double price;
    double weight;
    String color;
    String dough;
    boolean isCream;
    boolean isSugar;
    int calorie;
    boolean isChocolate;

    public TriangleCookie(double sideA, double sideB, String name, String manufacturer, double price, double weight, String color, String dough, boolean isCream, boolean isSugar, int calorie, boolean isChocolate) {
        super(sideA, sideB);
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.dough = dough;
        this.isCream = isCream;
        this.isSugar = isSugar;
        this.calorie = calorie;
        this.isChocolate = isChocolate;
    }

    public TriangleCookie(String name, String manufacturer, double price, double weight, String color, String dough, boolean isCream, boolean isSugar, int calorie, boolean isChocolate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.dough = dough;
        this.isCream = isCream;
        this.isSugar = isSugar;
        this.calorie = calorie;
        this.isChocolate = isChocolate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public boolean isCream() {
        return isCream;
    }

    public void setCream(boolean cream) {
        isCream = cream;
    }

    public boolean isSugar() {
        return isSugar;
    }

    public void setSugar(boolean sugar) {
        isSugar = sugar;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public boolean isChocolate() {
        return isChocolate;
    }

    public void setChocolate(boolean chocolate) {
        isChocolate = chocolate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TriangleCookie that = (TriangleCookie) o;
        return Double.compare(that.getPrice(), getPrice()) == 0 &&
                Double.compare(that.getWeight(), getWeight()) == 0 &&
                isCream() == that.isCream() &&
                isSugar() == that.isSugar() &&
                getCalorie() == that.getCalorie() &&
                isChocolate() == that.isChocolate() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getManufacturer(), that.getManufacturer()) &&
                Objects.equals(getColor(), that.getColor()) &&
                Objects.equals(getDough(), that.getDough());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getManufacturer(), getPrice(), getWeight(), getColor(), getDough(), isCream(), isSugar(), getCalorie(), isChocolate());
    }

    @Override
    public String toString() {
        return "TriangleCookie{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", dough='" + dough + '\'' +
                ", isCream=" + isCream +
                ", isSugar=" + isSugar +
                ", calorie=" + calorie +
                ", isChocolate=" + isChocolate +
                '}';
    }
}
