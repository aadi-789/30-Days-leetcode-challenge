import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {

        int[] frequency = new int[26];

        for (char task : tasks) {
            frequency[task - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        for (int freq : frequency) {
            if (freq > 0) {
                maxHeap.offer(freq);
            }
        }

        int time = 0;

        while (!maxHeap.isEmpty()) {

            List<Integer> used = new ArrayList<>();

            int cycle = n + 1;

            while (cycle > 0 && !maxHeap.isEmpty()) {

                int freq = maxHeap.poll();

                if (freq - 1 > 0) {
                    used.add(freq - 1);
                }

                time++;
                cycle--;
            }

            for (int freq : used) {
                maxHeap.offer(freq);
            }

            if (!maxHeap.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}
