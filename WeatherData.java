import java.util.ArrayList;
public class WeatherData {
    private ArrayList<Double> temperatures;
    public void cleanData (double lower, double upper) {
        for (int i = 0; i < temperatures.size(); i++) {
            double temp = temperatures.get(i);
            if (temp < lower || temp > upper) {
                temperatures.remove(i);
            }
        }
    }

    // public int longestHeatWave(double threshold)

    public WeatherData(ArrayList<Double> temps) {
        temperatures = temps;
    }

    public String toString() {
        return temperatures.toString();
    }
}