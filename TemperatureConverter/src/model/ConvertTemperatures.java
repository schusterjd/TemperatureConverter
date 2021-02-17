/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Feb 15, 2021
 */
package model;

public class ConvertTemperatures {

	private double temp;
	
	public ConvertTemperatures() {
		
		super();
		
	}
	
	
	public ConvertTemperatures(double temp) {
		
		super();
		this.temp = temp;
		
	}

	/**
	 * Converts Farenheit to Celsius.
	 * @return Celsius
	 */
	public double convertToC() {
		
		return (5.0 / 9) * (this.temp - 32);
		
	}
	
	/**
	 * Converts Celsius to Farenheit.
	 * @return Farenheit
	 */
	public double convertToF() {
		
		return (9.0 / 5) * this.temp + 32;
		
	}
	
	/**
	 * @return the temp
	 */
	public double getTemp() {
		return temp;
	}


	/**
	 * @param temp the temp to set
	 */
	public void setTemp(double temp) {
		this.temp = temp;
	}


	@Override
	public String toString() {
		return "ConvertTemperatures [temp=" + temp + "]";
	}
	
}
