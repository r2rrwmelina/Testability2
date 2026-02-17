public class BmiService {
    public int calculate(double weightKg, double heightM) { // weight - кг, height - метр
        int bmi = (int) (weightKg / Math.pow((heightM), 2));
        return bmi;
    }
}
