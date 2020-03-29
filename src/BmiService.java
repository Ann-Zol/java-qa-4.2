public class BmiService {
    public double calculate(double height, double weight)
    {
        double bmi = weight / (height * height); //упрощенная формула расчета индекса массы тела
        return bmi;
    }
}
