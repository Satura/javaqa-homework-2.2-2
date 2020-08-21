public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(50.3f,1.59f);
        if (bmi <= 16) System.out.printf("ИМТ = %f - выраженный дефицит массы тела",bmi);
        else if ((16 > bmi) || (bmi<= 18.5)) System.out.printf("ИМТ = %f - недостаточная (дефицит) масса тела",bmi);
        else if ((18.5 > bmi) || (bmi<= 25)) System.out.printf("ИМТ = %f - норма",bmi);
        else if ((25 > bmi) || (bmi<= 30)) System.out.printf("ИМТ = %f - избыточная масса тела (предожирение)",bmi);
        else if ((30 > bmi) || (bmi<= 35)) System.out.printf("ИМТ = %f - ожирение",bmi);
        else if ((35 > bmi) || (bmi<= 40)) System.out.printf("ИМТ = %f - ожирение резкое",bmi);
        else if (bmi > 40) System.out.printf("ИМТ = %f - очень резкое ожирение",bmi);
    }
}
