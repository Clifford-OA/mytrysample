package com.company;

public class MarsApplication {
    public static void main(String[] args){
  MarsRobot spirit =new MarsRobot();
  spirit.status="exploring";
  spirit.speed=2;
  spirit.temperature= -60;

  spirit.showAttributes();
  System.out.println("increasing speed to 3.");
  spirit.speed=3;
  spirit.showAttributes();
  System.out.println("Changing temperature to -90");
  spirit.temperature= -90;
  spirit.showAttributes();
  System.out.println("checking the temperature");
  spirit.checkTemperature();
  spirit.showAttributes();

    }
}
