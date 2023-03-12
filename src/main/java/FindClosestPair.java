public class FindClosestPair {
    public static double code(int[] numbers, int sum) {
        double distance = -1;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length-1; j++) {
                double distanceSum = numbers[i] + numbers[j];
                double absDistance = Math.abs(i - j);

                if(sum == distanceSum) {
                    if(distance == -1 || absDistance < distance) {
                        distance = absDistance;
                    }
                }
            }
        }

        return distance;
    }
}
