package enumerators2;

public class Main {

	public static void main(String[] args) {
		// ENUMS WITH VALUES
		/*USCurrency money = USCurrency.NICKLE;
		System.out.println(money.val);*/
		
		//ARRAY
		USCurrency coins[] = new USCurrency[3];
		coins[0] = USCurrency.PENNY;
		coins[1] = USCurrency.DIME;
		coins[2] = USCurrency.QUARTER;
		//may null ang console dahil wala akong nickle dito
		
		float sum = 0;
		
		for(USCurrency coin: coins) {
			sum = sum + coin.val;
			System.out.println(coin.name);
		}
	System.out.println(sum);
	
	}
	
}
