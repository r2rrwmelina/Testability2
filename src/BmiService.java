public class BmiService {
    public int calculate(double weightKg, double heightM) { // weight - кг, height - метр
        int bmi = (int) (weightKg / (heightM * heightM));
        return bmi;
    }
}
