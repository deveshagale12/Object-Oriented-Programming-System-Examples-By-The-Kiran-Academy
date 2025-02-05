package Abstraction_Encapsulation;

public class Temperature {

	double toFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	double toKelvin(double celsius) {
		return celsius + 273.15;
	}

}
