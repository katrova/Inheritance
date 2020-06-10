package com.company;

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

   1. Create a child  from the class Rectangle.
*/

import java.util.Objects;

public class Garden  extends Rectangle{
   private String place;
   private String ground;
   private String owner;
   private int priceForWeaving;
   private boolean isWatering;
   private boolean isHewn;
   private boolean isFlowers;
   private int treesCount;
   private int fruitTrees;
   private double annualCrop;

   //
    public Garden(int id, int length, int width, String place, String ground, String owner, int priceForWeaving, boolean isWatering, boolean isHewn, boolean isFlowers, int treesCount, int fruitTrees, double annualCrop) {
        super(id, length, width);
        this.place = place;
        this.ground = ground;
        this.owner = owner;
        this.priceForWeaving = priceForWeaving;
        this.isWatering = isWatering;
        this.isHewn = isHewn;
        this.isFlowers = isFlowers;
        this.treesCount = treesCount;
        this.fruitTrees = fruitTrees;
        this.annualCrop = annualCrop;
    }

    //
    public Garden(int length, int width, String place, String ground, String owner, int priceForWeaving, boolean isWatering, boolean isHewn, boolean isFlowers, int treesCount, int fruitTrees, double annualCrop) {
        super(length, width);
        this.place = place;
        this.ground = ground;
        this.owner = owner;
        this.priceForWeaving = priceForWeaving;
        this.isWatering = isWatering;
        this.isHewn = isHewn;
        this.isFlowers = isFlowers;
        this.treesCount = treesCount;
        this.fruitTrees = fruitTrees;
        this.annualCrop = annualCrop;
    }
//
    public Garden(String place, String ground, String owner, int priceForWeaving, boolean isWatering, boolean isHewn, boolean isFlowers, int treesCount, int fruitTrees, double annualCrop) {
        this.place = place;
        this.ground = ground;
        this.owner = owner;
        this.priceForWeaving = priceForWeaving;
        this.isWatering = isWatering;
        this.isHewn = isHewn;
        this.isFlowers = isFlowers;
        this.treesCount = treesCount;
        this.fruitTrees = fruitTrees;
        this.annualCrop = annualCrop;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPriceForWeaving() {
        return priceForWeaving;
    }

    public void setPriceForWeaving(int priceForWeaving) {
        this.priceForWeaving = priceForWeaving;
    }

    public boolean isWatering() {
        return isWatering;
    }

    public void setWatering(boolean watering) {
        isWatering = watering;
    }

    public boolean isHewn() {
        return isHewn;
    }

    public void setHewn(boolean hewn) {
        isHewn = hewn;
    }

    public boolean isFlowers() {
        return isFlowers;
    }

    public void setFlowers(boolean flowers) {
        isFlowers = flowers;
    }

    public int getTreesCount() {
        return treesCount;
    }

    public void setTreesCount(int treesCount) {
        this.treesCount = treesCount;
    }

    public int getFruitTrees() {
        return fruitTrees;
    }

    public void setFruitTrees(int fruitTrees) {
        this.fruitTrees = fruitTrees;
    }

    public double getAnnualCrop() {
        return annualCrop;
    }

    public void setAnnualCrop(double annualCrop) {
        this.annualCrop = annualCrop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Garden garden = (Garden) o;
        return getPriceForWeaving() == garden.getPriceForWeaving() &&
                isWatering() == garden.isWatering() &&
                isHewn() == garden.isHewn() &&
                isFlowers() == garden.isFlowers() &&
                getTreesCount() == garden.getTreesCount() &&
                getFruitTrees() == garden.getFruitTrees() &&
                Double.compare(garden.getAnnualCrop(), getAnnualCrop()) == 0 &&
                Objects.equals(getPlace(), garden.getPlace()) &&
                Objects.equals(getGround(), garden.getGround()) &&
                Objects.equals(getOwner(), garden.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPlace(), getGround(), getOwner(), getPriceForWeaving(), isWatering(), isHewn(), isFlowers(), getTreesCount(), getFruitTrees(), getAnnualCrop());
    }

    @Override
    public String toString() {
        return "Garden{" +
                "place='" + place + '\'' +
                ", ground='" + ground + '\'' +
                ", owner='" + owner + '\'' +
                ", priceForWeaving=" + priceForWeaving +
                ", isWatering=" + isWatering +
                ", isHewn=" + isHewn +
                ", isFlowers=" + isFlowers +
                ", treesCount=" + treesCount +
                ", fruitTrees=" + fruitTrees +
                ", annualCrop=" + annualCrop +
                ", PI=" + PI +
                '}';
    }
}
