class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // position and speed are parallel arrays - pair them so they sort together
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // nearest the target first, so every car is seen after the one ahead of it
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        Deque<Double> stack = new ArrayDeque<>();

        for (int[] car : cars) {
            // when this car would arrive if the road were empty. double, not int.
            double time = (double) (target - car[0]) / car[1];

            // strictly later than the fleet ahead -> it can never catch up -> new fleet
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            // otherwise it arrives no later, so it gets stuck behind and is absorbed
        }

        return stack.size();
    }
}