package com.company;

public class MarsRobot {
        String status;
    int speed;
    float temperature;

    void checkTemperature(){
      if (temperature< -80) {
          status = "returning home";
          speed = 5;
      }
      }
        void showAttributes (){
        System.out.println("status :"+ status);
        System.out.println("speed: "+speed);
        System.out.println("temperature: "+ temperature);



    }
}
