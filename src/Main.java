public class Main {
    public static void main(String[] args) {
        BmiService tolstak = new BmiService();
        int weight = 88;
        float hight = 1.75F;
        float bmi = tolstak.calculate(weight,hight);
        System.out.println(bmi);
    }
}
