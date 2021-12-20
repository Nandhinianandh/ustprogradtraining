public class Conversion{
    double cm,meter,km;
    double value;
    double magnitude1,magnitude2;
    public Conversion(double value) {
        if (value <= 0) {
            throw new ArithmeticException("cannot be zero");
        }
        this.value = value;

    }
    public Conversion (double magnitude1,double magnitude2){
        this.magnitude1 = magnitude1;
        this.magnitude2 = magnitude2;
    }

    public double cmToCm(){
            return value;
        }
        public double cmToMeter(){
            return value/100;
        }
        public double cmToKm(){
            return value/10000;
        }
    public double meterToCm(){
        return value*100;
    }
    public double additionMeterAndCentimeter(){
        return magnitude1 + (magnitude2/100);
    }
    public double additionKilometerAndCentimeter(){
        return magnitude1+(magnitude2*100000);
    }
    public double subtractMeterAndCentimeter(){
        return magnitude1-(magnitude2/100);
    }
    public double subtractCentimeterAndMeter(){
        return magnitude1-(magnitude2*100);
    }
    public double gramToGram()
    {
        return value;
    }
    public double kilogramToGram()
    {
        return value*1000;
    }
    public double addGramAndKilogramToGram(){
        return magnitude1+(magnitude2*1000);
    }
    public double subtractKilogramAndGramToKilogram(){
        return ((magnitude1*1000)-magnitude2)/1000;
    }
}
