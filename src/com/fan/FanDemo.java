package com.fan;

import java.util.Scanner;

public class FanDemo {

    public static void main(String[] args) {
        Fan fan = new Fan();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to know the current status of the Fan");
            System.out.println("Press 2 to change the speed of the Fan");
            System.out.println("Press 3 to change the direction of the Fan");
            System.out.println("Press 4 to exit");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println(fan.getFansSpeed().getFanSpeedRegulator().getPresentState());
                    System.out.println(fan.getFansDirection().getFanDirectionRegulator().getPresentState());
                    break;
                case 2:
                    fan.getFansSpeed().getFanSpeedRegulator().pull(fan.getFansSpeed());
                    System.out.println(fan.getFansDirection().getFanDirectionRegulator().getPresentState());
                    break;
                case 3:
                    System.out.println(fan.getFansSpeed().getFanSpeedRegulator().getPresentState());
                    fan.getFansDirection().getFanDirectionRegulator().pull(fan.getFansDirection());
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }


    }


}
