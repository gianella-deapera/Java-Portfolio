package enumerators2;

public enum USCurrency {

	PENNY(0.01f, "Penny"),
	NICKLE(0.05f,"Nickle"),
	DIME(0.1f, "Dime"),
	QUARTER(0.25f);
	
	float val;
	String name;
	
	USCurrency (float val, String name){
		this.val = val;
		this.name = name;
	}
	USCurrency (float val){
		this.val = val;
	}
}
