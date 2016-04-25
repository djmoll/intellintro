package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float local = (value-32)*(5/9);
        return new Celsius(local);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(value);
    }



    public String toString()
    {
        return value + " F";
    }
}

