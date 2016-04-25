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
        double local = value*(9.0/5.0)+32;
        return new Fahrenheit((float) local);
    }


    public String toString()
    {
            return value + " C";
    }
}
