public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double heightM = 1.85;
        double weightKg = 100;

        double bmiValue = service.calculate (heightM, weightKg);

        System.out.println(bmiValue);
    }
}

