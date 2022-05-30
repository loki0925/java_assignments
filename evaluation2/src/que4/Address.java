package que4;

public class Address {
 
	String city;
	String state;
	String  pinCode;
	
	public Address(String city, String state, String pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	public Address(){
		super();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
}
