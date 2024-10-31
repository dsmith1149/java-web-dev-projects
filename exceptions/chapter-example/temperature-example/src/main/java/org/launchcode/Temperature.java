package org.launchcode;

public class Temperature {
    private double fahrenheit;

    public Temperature(String message) {
        super();
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {
        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            try {
                throw new TemperatureException("That temperature is too low!");
            } catch (TemperatureException exception) {
                exception.printStackTrace();
            }
        } else {
            fahrenheit = aFahrenheit; // Only set if valid
        }
    }
}
