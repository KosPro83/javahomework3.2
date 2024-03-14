public class BmiService {
    public int calculate(int weight, double height) {
        double bmi = weight / (height * height); // считаем ИМТ
        return (int) bmi; // возвращаем рассчитанный индекс массы тела
    }
}


