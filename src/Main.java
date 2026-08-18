public class Main {
    public static void main(String[] args) {
        PayClient client = new PayClient();
        client.creatoldPayment(1000, "usd", "tok_visa");
    }
}
