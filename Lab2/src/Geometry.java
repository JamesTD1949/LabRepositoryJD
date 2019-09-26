public class Geometry {
    private double xVal,yVal;

    public Geometry(){
        this.xVal=0;
        this.yVal=0;
    }

    public Geometry(double xVal,double yVal){
        setxVal(xVal);
        setyVal(yVal);

    }

    public double getxVal(){
        return xVal;
    }

    public double getyVal(){
        return yVal;
    }

    public void setxVal(double xVal){
        this.xVal=xVal;
    }

    public void setyVal(double yVal){
        this.yVal=yVal;
    }

    public void moveHorizontally(double xVal){
        this.xVal+=xVal;

    }

    public void moveVertically(double yVal){
        this.yVal+=yVal;

    }

    public void translate(double xVal,double yVal)
    {
        moveHorizontally(xVal);
        moveVertically(yVal);

    }

    public double distanceFromOrigin(){
        return(Math.sqrt((Math.pow(this.xVal,2))+(Math.pow(this.yVal,2))));
    }

    public String toString(){
        return("Original Values: X-Coordinate: " + getxVal() + " Y-Coordinates: " + getyVal());
    }
}
