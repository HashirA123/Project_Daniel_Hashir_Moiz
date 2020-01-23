package First;

public class Converter {
	
	/*
	* @Author: 
	* Daniel Long
	* Hashir Ahmed
	* Moiz Abdullah
	*/
	private static double celsiusToFahrenheit(double C){
		double result;
		result = ((C * (9.0/5.0)) + 32);
		return result;
	}
	private static double fahrenheitToCelsius(double F){
		double result;
		result = (F-32)*(5.0/9.0);
		return result;
	}
	public static void main(String[] args) {
		System.out.println("180 Celsius is "+ celsiusToFahrenheit(180.0)+" Degrees Farenheit");
		System.out.println("250 Farenheit is "+ fahrenheitToCelsius(250.0)+" Degrees Celsius");
		
	}
}
