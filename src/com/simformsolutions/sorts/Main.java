package com.simformsolutions.sorts;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    ArrayList<District> districtArrayList = new ArrayList<>();

    districtArrayList.add(new District("Ahmedabad", 1 ));
    districtArrayList.add(new District("Rajkot", 3));
    districtArrayList.add(new District("Junagadh", 11 ));
    districtArrayList.add(new District("Kheda", 7 ));
    districtArrayList.add(new District("Surat", 5));
    districtArrayList.add(new District("Vadodara", 6));
    districtArrayList.add(new District("Mehsana", 2));
    districtArrayList.add(new District("Porbander", 25));

    for (District district1 :
            districtArrayList) {
      System.out.println(district1);
    }
    Collections.sort(districtArrayList);

    System.out.println();
    System.out.println("After Sort : \n");
    for (District district2 :
            districtArrayList) {
      System.out.println(district2);
    }
  }
}