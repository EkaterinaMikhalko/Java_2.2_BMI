public class BmiService {
    public double calculate(double heightM, double weightKg){

        double bmi = weightKg/heightM/heightM;

        return bmi;



    }
}
