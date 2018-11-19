public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        int dist = 0;
        dist = (int) (Math.random() * 10) + dist;
        return dist;
    }

    public boolean simulate() {
        int position = 0;
        for (int count = 0; count < maxHops; count++) {
            position += hopDistance();
            if (position >= goalDistance) {
                return true;
            } else if (position < 0) {
                return false;
            }
            return false;
        }
        return simulate();
    }

    public double runSimulations(int num) {
        int countSuccess = 0;
        for (int count = 0; count < num; count++) {
            if (simulate()) {
                countSuccess++;
            }
        }
        return (double) countSuccess / num;
    }
}
