package exceptionsfiles;

public class NegativePaymentException extends Exception {
	private double payment;
	
	public NegativePaymentException(double pymt) {
		this.payment = pymt;
	}
	public String toString() {
		return "Error: Cannot take negative payment of " + this.payment;
	}
}
