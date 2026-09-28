

public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        int answer = high;

        while (low <= high) {
            int capacity = low + (high - low) / 2;

            if (canShip(weights, days, capacity)) {
                answer = capacity;
                high = capacity - 1; // Try smaller capacity
            } else {
                low = capacity + 1; // Need larger capacity
            }
        }

        return answer;
    }

    private boolean canShip(int[] weights, int days, int capacity) {

        int currentWeight = 0;
        int requiredDays = 1;

        for (int weight : weights) {

            if (currentWeight + weight > capacity) {
                requiredDays++;
                currentWeight = 0;
            }

            currentWeight += weight;

            if (requiredDays > days) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        CapacityToShipPackagesWithinDDays shipper = new CapacityToShipPackagesWithinDDays();
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int result = shipper.shipWithinDays(weights, days);
        System.out.println("Minimum capacity to ship packages within " + days + " days: " + result); // Output: Minimum capacity to ship packages within 5 days: 15
    }
}
