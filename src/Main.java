public class Main {
    public static void main(String[] args) {
        PayClient p1 = new PayClient();
        p1.createCharge(1000, "usd", "tok_visa");
    }
}
