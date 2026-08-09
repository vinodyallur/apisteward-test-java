public class Main {
    public static void main(String[] args) {
        PayClient c1 = new PayClient();
        c1.createCharge(1000, "usd", "tok_visa");
    }
}
