public class Main {
    public static int power(int base, int expo) {
        if (expo == 0) {
            return 1;
        } else {
            return power(base, expo - 1) * base;
        }
    }
    public static void main(String[] args){
        System.out.println(power(3 ,2));
    }
}
