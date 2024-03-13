public class BmiService {
    public double CalcService(double weight, double height) {
        double bmi = weight / (height * height); // считаем ИМТ
        return bmi; // возвращаем рассчитанный индекс массы тела
    }
}


