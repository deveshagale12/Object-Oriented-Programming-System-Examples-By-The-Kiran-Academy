package Abstraction_Encapsulation;

public class Temperature_Main {

	public static void main(String[] args) {
		Temperature t=new Temperature();
		double celsius = 25.0; // Example temperature

        System.out.println(celsius + "°C in Fahrenheit: " + t.toFahrenheit(celsius) + "°F");
        System.out.println(celsius + "°C in Kelvin: " + t.toKelvin(celsius) + "K");

	}

}
