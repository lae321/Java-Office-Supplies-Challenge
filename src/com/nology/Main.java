package com.nology;

public class Main {

  public static void main(String[] args) {
    OfficeSupplyTracker tracker = new OfficeSupplyTracker(1000,200,8000, 50, 300);

    System.out.println(tracker.calculatePossibleStaff());
  }
}
