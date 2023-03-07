package com.parasiteplugin.ClassObjects;

public class PlayerClass {

    
    // class variables
    
    // gameclass name
    private String className = "not-set";

    // gameclass attributes
    private double speed = -1;
    private double health = -1;
    private double energy = -1;
    private double sanity = -1;
    private double armor = -1;
    private double damage = -1;
    private double attackSpeed = -1;
    private double attackRange = -1;
    private double visionRange = -1;
    private double energyRegen = -1;
    private double healthRegen = -1;
    private double hungerDecay = -1;

    // getters
    public String getClassName(){
        return className;
    }

    public double getSpeed(){
        return speed;
    }

    public double getHealth(){
        return health;
    }

    public double getEnergy(){
        return energy;
    }

    public double getSanity(){
        return sanity;
    }

    public double getArmor(){
        return armor;
    }

    public double getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }

    public double getAttackRange(){
        return attackRange;
    }

    public double getVisionRange(){
        return visionRange;
    }

    public double getEnergyRegen(){
        return energyRegen;
    }

    public double getHealthRegen(){
        return healthRegen;
    }

    public double getHungerDecay(){
        return hungerDecay;
    }

    
    // setters
    public void setClassName(String input){
        className = input;
    }

    public void setSpeed(double input){
        speed = input;        
    }

    public void setHealth(double input){
        health = input;
    }

    public void setEnergy(double input){
        energy = input;
    }

    public void setSanity(double input){
        sanity = input;
    }

    public void setArmor(double input){
        armor = input;
    }

    public void setDamage(double input){
        damage = input;
    }

    public void setAttackSpeed(double input){
        attackSpeed = input;
    }

    public void setAttackRange(double input){
        attackRange = input;
    }

    public void setVisionRange(double input){
        visionRange = input;                
    }

    public void setEnergyRegen(double input){
        energyRegen = input;
    }

    public void setHealthRegen(double input){
        healthRegen = input;       
    }

    public void setHungerDecay(double input){
        hungerDecay = input;
    }

}
