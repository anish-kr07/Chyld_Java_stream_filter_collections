package com.javaPractice;


import java.util.ArrayList;
import java.util.List;

public class Arithmetic {
    private List<Double> list;

    public Arithmetic() {
        this.list = new ArrayList<Double>();;
    }
    public double mean(List<Double> list){
        double sum =(list.stream().reduce(0.0,(a,c) -> a+c))/(list.size());
        System.out.printf("avergae " + sum);
        return sum;
    }


}
