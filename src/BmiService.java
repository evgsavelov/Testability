public class BmiService {
    public float calculate (int weight, float hight) {
        float bmi = weight/(hight*hight);
        return bmi;
    }
}
