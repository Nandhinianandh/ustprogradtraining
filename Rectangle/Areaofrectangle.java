public class Areaofrectangle {
    public double rectangle(double length ,double width){
        if(length<=0 || width<=0 || length==width){
            throw new ArithmeticException("error");
        }

        return length * width;


    }
}
