
package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;
    private String make;
    private String model;

    Car(String make,String model, String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.make = make;
        this.model = model;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor(){
        return this.color;
    }

    public int getYear(){
        return this.year;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public boolean IsElectric() {
        return this.isElectric;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
    public void accelerateSpeed(){
        System.out.println("accelerating... ");
        this.setSpeed(this.getSpeed() + 5);

        if(this.getSpeed() >= this.getMaxSpeed()){
            this.setSpeed(this.getMaxSpeed());
            System.out.println("This vehicle has reached max speed.");
        }
        System.out.println("This "+this.getMake()+" has accelerated to "+ this.getSpeed() +"mph.");
       // System.out.println("This "+this.getMake()+" is now going "+ this.getSpeed() +"mph.");
        if(this.getSpeed()> 70){
            System.out.println("This " + this.getColor()+" "+this.getYear() +" " + this.getMake() +" "+this.getModel()+ " is speeding! Pull over!");
            int amountOverLimit = this.getSpeed() - 70;
            this.setSpeed(0);
            System.out.println("This " + this.getYear() +" " + this.getMake() +" "+this.getModel()+ " has now stopped and has received a speeding ticket for going " + amountOverLimit + "mph over the speed limit.");
        }

    }
    public void decelerateSpeed(){
        System.out.println("decelerating... ");
        this.setSpeed(this.getSpeed() - 5);
        if(this.getSpeed() <= 0){
            this.setSpeed(0);
            System.out.println("This vehicle is already stopped.");
        } else {
        System.out.println("This "+this.getMake()+" has decelerated to "+ this.getSpeed() +"mph.");
        }
    }
    public void convertToElectric(){
        if(this.isElectric){
            System.out.println("This " +this.getColor()+" "+this.getYear() +" " + this.getMake() +" "+this.getModel()+" is already electric.");
        } else {
            this.setElectric(true);
        }

    }
    public void reportSpeed(){
        System.out.println("This "+this.getMake()+" is now going "+ this.getSpeed() +"mph.");
    }

}
