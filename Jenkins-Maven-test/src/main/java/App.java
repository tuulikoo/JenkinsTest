import calculator.DistanceCalculator;
import calculator.Point;


public class App {

	public static void main(String[] args) {
		
		//Point point1 = new Point (60.273311819436174, 25.037022538972646);
		
		//Point point2 = new Point (67.564709, 24.224625);
		Point point1 = new Point(60.273311819436174, 25.037022538972646);
        Point point2 = new Point(67.564709, 24.224625);
		
		double distance = DistanceCalculator.calculateDistance(point1, point2);
		
		System.out.println("Helsingin ja Ylläksen välimatka on " + distance + " metriä eli " + distance/1000 + " km.");
		
		
        
	}

}