public class First {
    public static void main(String[] args) {
        final float fator1 = 9f/5;
        final int fator2 = 32;
        float celsius1 = 25;
        float celsius2 = 100;
        float fahrenheit1;
        float fahrenheit2;
        fahrenheit1 = (celsius1 * fator1) + fator2;
        fahrenheit2 = (celsius2 * fator1) + fator2;
        System.out.println(fahrenheit1);
        System.out.println(fahrenheit2);
    }
}