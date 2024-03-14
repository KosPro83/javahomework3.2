public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // вес в килограммах
        double height = 1.87; // рост в метрах
        double bmi = service.calculate((int) weight, height); // считаем ИМТ
        String bmiResult = String.format("%.1f", bmi); // округляем
        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height * 100 + " см.");
        System.out.println("Ваш индекс массы тела: " + bmiResult);
    }

}