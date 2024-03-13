public class BmiService {
    public int CalcService(int weight, double height) {
        double bmi = weight / (height * height); // считаем ИМТ
        return (int) bmi; // возвращаем рассчитанный индекс массы тела
    }
}


