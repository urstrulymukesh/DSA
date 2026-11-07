
import java.util.*;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int q = queries.length;
        int[] ans = new int[q];

   
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int[][] sortedQueries = new int[q][2];

        for (int i = 0; i < q; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }

        Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a[0], b[0]));

      
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        for (int i = 0; i < q; i++) {

            int end = sortedQueries[i][0];
            int start = end - x;
            int originalIndex = sortedQueries[i][1];

        
            while (right < logs.length && logs[right][1] <= end) {

                int server = logs[right][0];

                map.put(server, map.getOrDefault(server, 0) + 1);

                right++;
            }

          
            while (left < right && logs[left][1] < start) {

                int server = logs[left][0];

                if (map.get(server) == 1) {
                    map.remove(server);
                } else {
                    map.put(server, map.get(server) - 1);
                }

                left++;
            }

            
            ans[originalIndex] = n - map.size();
        }

        return ans;
    }
}
