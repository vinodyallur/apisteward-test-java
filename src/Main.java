public class Main {
    public static void main(String[] args) {
        PayClient client = new PayClient();
        client.createCharge(1000, "usd", "tok_visa");
    }
}
