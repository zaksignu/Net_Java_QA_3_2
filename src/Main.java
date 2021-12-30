public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 90.5;
        double height = 1.83;
        double bmiValue = service.calculate(weight,height);
        System.out.print("ИМТ: ");
        System.out.println(bmiValue);
    }
}
