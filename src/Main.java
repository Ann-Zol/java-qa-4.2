public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); //создание экземляра класса для расчета индекса массы тела
        double height = 1.7; //рост в метрах
        double weight = 82.6; //вес в киллограммах
        double bmiResult = service.calculate(height, weight); //расчет индекса массы тела
        System.out.println(bmiResult);
    }
}
