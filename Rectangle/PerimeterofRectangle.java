public class PerimeterofRectangle {
    public double por(double length ,double width){
        if(length<=0 || width<=0 || length==width){
            throw new ArithmeticException("error");
        }

        return 2*(length + width);


    }
}
