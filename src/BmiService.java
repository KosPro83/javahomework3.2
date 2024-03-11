public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = weight / (height * height); // считаем ИМТ
        return bmi; // возвращаем рассчитанный индекс массы тела
    }
}