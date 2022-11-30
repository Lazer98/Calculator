package point;

public class Mortgage {
	private int principal;
	private int annual;
	private int years;
	
	public int getPrincipal(){
		 return principal;
	 }
	public int getAnnual(){
		 return annual;
	 }
	public int getYears(){
		 return years;
	 }
	
	public void setPrincipal(int principal) {
		this.principal=principal;
	}
	public void setAnnual(int annual) {
		this.annual=annual;
	}
	public void setYears(int years) {
		this.years=years;
	}
	
	public Mortgage() {
	}

	public Mortgage(int annual,int years,int principal) {
		this.annual=annual;
	    this.years=years;
	    this.principal=principal;
	}
	
	
}
