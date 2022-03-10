package com.nology;

import org.junit.Before;
import static org.junit.Assert.*;

public class OfficeSuppliesTest {
  private OfficeSupplyTracker tracker;

  @Before
  public void setup() {
    tracker = new OfficeSupplyTracker(1000, 200, 8000, 50, 300);
  }

  @org.junit.Test
  public void RemovePens_RemoveAmount_ReturnUpdatedAmount() {
    tracker.removePens(258);
    assertEquals(742, tracker.getPens());
  }

  @org.junit.Test
  public void AddPens_AddAmount_ReturnUpdatedAmount() {
    tracker.addPens(1500);
    assertEquals(2500, tracker.getPens());
  }

  @org.junit.Test
  public void RemoveStaples_RemoveAmount_ReturnUpdatedAmount() {
    tracker.removeStaples(1000);
    assertEquals(7000, tracker.getStaples());
  }

  @org.junit.Test(expected = IllegalArgumentException.class)
  public void RemoveStaples_RemoveInvalidAmount_ThrowError() {
    tracker.removeStaples(18400);
  }

  @org.junit.Test
  public void AddRulers_AddAmount_ReturnUpdatedAmount() {
    tracker.removeRulers(50);
    tracker.addRulers(300);
    assertEquals(300, tracker.getRulers());
  }

  @org.junit.Test
  public void
      calculatePossibleStaff_calculatePossibleStaffWithCurrentInventory_ReturnPossibleStaff() {
    assertEquals(16, tracker.calculatePossibleStaff());
  }
}
