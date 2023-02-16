import java.text.DecimalFormat;

public class BmiService {
    public double calculate(int weight, double height) {
        return weight / (height * height);
    }
}