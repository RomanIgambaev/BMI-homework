import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        try {

            System.out.println("Привет, это калькулятор индекса массы тела, для начала введи свой вес");
            weight = scanner.nextDouble();
            System.out.println("Отлично твой вес:" + weight + " " + "теперь введи свой рост в метрах");
            height = scanner.nextDouble();
            double bmi = Math.round (weight / (height * height));
            if (bmi <= 18.5){
                System.out.println("Ты дрыщ, твой ИМТ:" + bmi);
            }  else if (bmi <= 25.0) {
                System.out.println("Ты гигачад, твой ИМТ:" + bmi);
            } else if (bmi <= 30.0)
                System.out.println("Ты толстячок, твой ИМТ" + bmi);
            else if (bmi > 30) System.out.println("Ты жирнич, твой ИМТ:" + bmi);
        }
        catch (Exception ex){
            System.out.println("Нормально же всё объяснил, а ты ввёл что-то не так, перезагружай прогу теперь");
        }
    }
}