package com.nology;

public class OfficeSupplyTracker {
  private int pens;
  private int staplers;
  private int staples;
  private int rulers;
  private int a4Booklets;

  public OfficeSupplyTracker(int pens, int staplers, int staples, int rulers, int a4Booklets) {
    this.pens = pens;
    this.staplers = staplers;
    this.staples = staples;
    this.rulers = rulers;
    this.a4Booklets = a4Booklets;
  }

  public int getPens() {
    return pens;
  }

  public void setPens(int pens) {
    this.pens = pens;
  }

  public void addPens(int pens) {
    this.pens += pens;
  }

  public void removePens(int pens) {
    this.pens -= pens;
  }

  public int getStaplers() {
    return staplers;
  }

  public void setStaplers(int staplers) {
    this.staplers = staplers;
  }

  public void addStaplers(int staplers) {
    this.staplers += staplers;
  }

  public void removeStaplers(int staplers) {
    this.staplers -= staplers;
  }

  public int getStaples() {
    return staples;
  }

  public void setStaples(int staples) {
    this.staples = staples;
  }

  public void addStaples(int staples) {
    this.staples += staples;
  }

  public void removeStaples(int staples) {
    if (staples > this.staples) {
      throw new IllegalArgumentException("Too many staples m8");
    }
    this.staples -= staples;
  }

  public int getRulers() {
    return rulers;
  }

  public void setRulers(int rulers) {
    this.rulers = rulers;
  }

  public void addRulers(int rulers) {
    this.rulers += rulers;
  }

  public void removeRulers(int rulers) {
    this.rulers -= rulers;
  }

  public int getA4Booklets() {
    return a4Booklets;
  }

  public void setA4Booklets(int a4Booklets) {
    this.a4Booklets = a4Booklets;
  }

  public void adda4Booklets(int a4Booklets) {
    this.a4Booklets += a4Booklets;
  }

  public void removea4Booklets(int a4Booklets) {
    this.a4Booklets -= a4Booklets;
  }

  public int calculatePossibleStaff() {
    int possibleStaff = 0;
    while (pens >= 5 && staplers >= 1 && staples >= 100 && rulers >= 3 && a4Booklets >= 4) {
      removePens(5);
      removeStaplers(1);
      removeStaples(100);
      removeRulers(3);
      removea4Booklets(4);
      possibleStaff++;
    }
    return possibleStaff;
  }
}
