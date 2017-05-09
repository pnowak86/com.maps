package com.mapy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, Car> myMap = new LinkedHashMap<>();

        ArrayList<Car> myCars = new ArrayList<>();


        for (int i = 0; i < 1000; i++) 
        {
            Car currentCar = new Car("kr55" + i);
            myCars.add(currentCar);
            myMap.put(currentCar.reg, currentCar);

        }

        for (Car car : myCars) {
            System.out.println(car.reg);
        }
    }}
        //LinkedHashMap<String, Car> myMap = new LinkedHashMap<>( );
       // myMap.put("KR5506", new Car("KR5506"));
        //myMap.put("KR5507", new Car("KR5511"));
       // myMap.put("KR5508", new Car("KR5508"));

       // System.out.println(myMap.size());

        //Car foundCar = myMap.get("KR5507");
       // myMap.remove("KR5507");
        //Car foundCar = myMap.get("KR5507");

       // myMap.

        //System.out.println(foundCar.reg);
       // System.out.println("index: " + "rstt".indexOf("s"));
        //System.out.println(5 + "" + 7);



