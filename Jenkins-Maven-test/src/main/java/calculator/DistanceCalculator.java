package calculator;

public class DistanceCalculator {
	
    private static final double EARTH_RADIUS = 6371000; // Maapallon säde metreissä

    public static double calculateDistance(Point point1, Point point2) {
    	
    	
        double x1 = Math.toRadians(point1.getX());
        double y1 = Math.toRadians(point1.getY());
        double x2 = Math.toRadians(point2.getX());
        double y2 = Math.toRadians(point2.getY());
        
        if(x1 <0|| x2 < 0 ||y1<0||y2<0) {
        	throw new IllegalArgumentException("Invalid input: Koordinaatit negatiiviset");
        }

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        double a = Math.pow(Math.sin(deltaX / 2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(deltaY / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distanceInMeters = EARTH_RADIUS * c;

        return distanceInMeters;
    }
}