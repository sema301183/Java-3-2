import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 100;
        double height = 1.74;
        double mass = service.calculate(weight, height);
        String recommended;

        if (mass >= 0 && mass <= 15.99) {
            recommended = "Выраженный дефицит массы тела. Необходима срочная консультация специалиста.";
        }
        else if (mass >= 16 && mass <= 18.49) {
            recommended = "Недостаточная (дефицит) масса тела. Необходима консультация специалиста.";
        }
        else if (mass >= 18.50 && mass <= 24.99) {
            recommended = "Норма.";
        }
        else if (mass >= 25 && mass <= 29.99) {
            recommended = "Избыточная масса тела (предожирение). Необходима консультация специалиста.";
        }
        else if (mass >= 30 && mass <= 34.99) {
            recommended = "Ожирение первой степени. Необходима консультация специалиста.";
        }
        else if (mass >= 35 && mass <= 39.99) {
            recommended = "Ожирение второй степени. Необходима консультация специалиста.";
        }
        else if (mass >= 40) {
            recommended = "Ожирение третьей степени (морбидное). Необходима срочная консультация специалиста.";
        }
        else {
            recommended = "Затрудняемся предоставить вам рекомендации. Необходима консультация специалиста.";
        }

        String formattedMass = new DecimalFormat("#0.00").format(mass);
        System.out.println("Ваш индекс массы тела составляет = " + formattedMass + " Kg/M2. " + recommended);
    }
}