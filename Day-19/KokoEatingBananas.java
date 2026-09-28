/**
 * KokoEatingBananas
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Maximum pile is the upper bound
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                answer = mid;
                high = mid - 1; // Try a smaller speed
            } else {
                low = mid + 1; // Need a faster speed
            }
        }

        return answer;
    }

    private boolean canFinish(int[] piles, int h, int speed) {

        long hours = 0;

        for (int pile : piles) {
            // Ceiling division: ceil(pile / speed)
            hours += (pile + speed - 1) / speed;

            if (hours > h) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        KokoEatingBananas koko = new KokoEatingBananas();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int result = koko.minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result); // Output: Minimum eating speed: 4
    }
    
}