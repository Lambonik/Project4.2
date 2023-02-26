public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double heightMeters = 1.86;

        System.out.println("bmi-индекс " + service.calculate(weightKg, heightMeters));

    }
}
