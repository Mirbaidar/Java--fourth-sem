public class Fraction {
    int num;
    int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;

    }

    public  int Hcf() {
        int hcf = 1;
        for (int i = 2; i <= 9; i++) {
            if (num % i == 0 && den % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

   public void simplify() {
        int divider = Hcf();
        num = num / divider;
        den = den / divider;
        System.out.println(num + "/" + den);

    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 9);
        f1.simplify();
    }
}
