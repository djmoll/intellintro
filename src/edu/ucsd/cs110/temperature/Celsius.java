package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        float local = value*(9/5)+32;
        return new Fahrenheit(local);
    }


    public String toString()
        {
            // TODO: Complete this method
            return value + " C";
        }
}
