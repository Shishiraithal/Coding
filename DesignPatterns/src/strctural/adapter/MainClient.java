package strctural.adapter;

public class MainClient {
	public static void main(String[] args) throws Exception {
		
		PaymentAdapter paymentAdapter = new PaymentAdapter();
		paymentAdapter.doPayment(new String[][]{{"123","bala","developer"},{"345","jak","marketing"}});
		
	}
}
