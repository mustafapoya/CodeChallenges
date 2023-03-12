import java.util.ArrayList;
import java.util.Arrays;

public class FareEstimator {
    public static double[] code(double rideTime, double rideDistance, double [] costPerMinute, double [] costPerMile) {
        double [] fareCost = new double[costPerMile.length];

        for(int i = 0; i < costPerMile.length; i++) {
            fareCost[i] = Double.parseDouble(String.format("%2f", (rideTime * costPerMinute[i] + rideDistance * costPerMile[i])));
        }

        System.out.println(Arrays.toString(fareCost));
        return fareCost;
    }
}
