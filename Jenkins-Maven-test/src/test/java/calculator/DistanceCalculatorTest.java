package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class DistanceCalculatorTest {

    @Test
    public void testCalculateDistanceWithSamePoints() {
        Point point1 = new Point(60.273311819436174, 25.037022538972646);
        double distance = DistanceCalculator.calculateDistance(point1, point1);
        assertEquals(0.0, distance, 0.01, "Testi väärin, samat aloituspisteet");
        System.out.println("WithSamePoints: Expected  0.0 " + ", distance " + distance);
    }

    @Test
    public void testCalculateDistanceWithDifferentPoints() {
        Point point1 = new Point(60.273311819436174, 25.037022538972646);
        Point point2 = new Point(67.564709, 24.224625);
        double expectedDistance = 811720.72; // Oletettu etäisyys metrinä
        double distance = DistanceCalculator.calculateDistance(point1, point2);
        assertEquals(expectedDistance, distance, 0.01, "Testi väärin, eri aloituspisteet");
        System.out.println("WithDifferentPoints: Expected " + expectedDistance + ", distance " + distance);
        
    }
    
    

    @Test
    public void testCalculateDistanceWithNegativeCoordinates() {
    	
        Point point1 = new Point(-60.0, -25.0);
        Point point2 = new Point(-67.0, -24.0);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> DistanceCalculator.calculateDistance(point1, point2));
        assertEquals("Invalid input: Koordinaatit negatiiviset", exception.getMessage(), "Ei tullut virheviestiä negatiivisella luvulla");
    }
}