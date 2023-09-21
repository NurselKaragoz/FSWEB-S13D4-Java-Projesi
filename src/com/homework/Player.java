package com.homework;

public class Player {
   private String name;
   private int healthPercentage;
    Weapon weapon;

enum Weapon{}
 public Player( int healthPercentage){
if(healthPercentage>100 ){
this.healthPercentage=100;
}
else if (healthPercentage<0){
this.healthPercentage=0;
}
else{
this.healthPercentage=healthPercentage;
}
}
}