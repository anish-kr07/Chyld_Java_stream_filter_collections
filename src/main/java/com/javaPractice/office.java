package com.javaPractice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Office {
        private String name;
        private String location;
        private int numberOfEmployees;

        Office(String name, String location, int numberOfEmployees) {
            this.name = name;
            this.location = location;
            this.numberOfEmployees = numberOfEmployees;
        }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int findLocation(ArrayList<Office> offices,String loc){
        List<Office> findBylocation = (List<Office>) offices
                .stream()
                .filter(off -> off.getLocation() == loc)
                .collect(Collectors.toList());
        return findBylocation.size();
    }

    public List<Office> officesLessThanTen(ArrayList<Office> offices) {
        return offices.stream()
                .filter(o -> o.getNumberOfEmployees() < 10)
                .collect(Collectors.toList());
    }

    public List<Office> officesMoreThanHundred(ArrayList<Office> offices) {
//         return offices.stream()
//                .filter(off -> off.getNumberOfEmployees() < 10)
//                 .count();

        return offices.stream()
                .filter(o -> o.getNumberOfEmployees() > 100)
                .collect(Collectors.toList());
    }
    public List<Office> beginsWithA_K(ArrayList<Office> offices) {
        return offices.stream()
                .filter(o -> {return o.getName().charAt(0) == 'A' ||  o.getName().charAt(0) == 'K';})
                .collect(Collectors.toList());
    }

    public List<Office> withVowel(ArrayList<Office> offices) {
        return offices.stream()
                .filter(o -> {
                    List<Character> myList = new ArrayList<Character>(Arrays.asList('A','E','I','O', 'U'));
                    return myList.contains(o.getName().charAt(0));
                })
                .collect(Collectors.toList());
    }

}

