public class BmiService {
    public double calculate(double weightKg, double heightMeters) {
        double bmi = weightKg/heightMeters/heightMeters;
        return (int)bmi;

    }
}
