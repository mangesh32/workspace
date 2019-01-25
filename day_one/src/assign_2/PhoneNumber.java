package assign_2;

public class PhoneNumber {
	private String areaCode;
	private String exchange;
	private String extension;
	public PhoneNumber(String areaCode, String exchange, String extension) {
		super();
		this.areaCode = areaCode;
		this.exchange = exchange;
		this.extension = extension;
	}
	
	
	
	@Override
	public String toString() {
		return "("+areaCode+") "+exchange+"-"+extension;
	}
	
	public boolean equals(PhoneNumber q) {
		return (this.areaCode==q.areaCode &&
				this.exchange==q.exchange &&
				this.extension==q.extension);
	}
	
	

}
