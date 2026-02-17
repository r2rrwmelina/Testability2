public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi = service.calculate(98.0, 1.87); // проверка примера из задания
        System.out.println("Ваш индекс массы тела равен: " + bmi);

        System.out.println();
        bmi = service.calculate(52.4, 1.64); // проверка своего примера
        System.out.println("Ваш индекс массы тела равен: " + bmi);
    }
}