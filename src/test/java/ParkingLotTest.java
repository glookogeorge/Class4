package test.java;

import main.java.ParkingLot;
import org.junit.*;
import static org.junit.Assert.*;

/** 
* ParkingLot Tester.
* 
* @author <Authors name> 
* @since <pre>Aug 18, 2015</pre> 
* @version 1.0 
*/ 
public class ParkingLotTest {

    private ParkingLot parkingLot;

@Before
public void before() throws Exception {
    parkingLot = new ParkingLot(10);
} 

@After
public void after() throws Exception {
    parkingLot = null;
} 

/** 
* 
* Method: parkCar() 
* 
*/ 
@Test
public void testParkCar() throws Exception {
    System.out.println("Testing parkCar()");
    parkingLot.parkCar();
    parkingLot.parkCar();
    assertEquals(parkingLot.getMaxSpots(), 10);
    assertEquals(parkingLot.getTakenSpots(), 2);
} 

/** 
* 
* Method: unparkCar() 
* 
*/ 
@Test
public void testUnparkCar() throws Exception {
    System.out.println("Testing unParkCar()");
    parkingLot.parkCar();
    parkingLot.parkCar();
    parkingLot.parkCar();
    parkingLot.parkCar();
    parkingLot.unparkCar();
    assertEquals(parkingLot.getMaxSpots(), 10);
    assertEquals(parkingLot.getTakenSpots(), 3);
}


} 
