public class Geometry {
    private int xVal,yVal;

    public Geometry(){
        this.xVal=0;
        this.yVal=0;
    }

    public Geometry(int xVal,int yVal){
        setxVal(xVal);
        setyVal(yVal);

    }

    public int getxVal(){
        return xVal;
    }

    public int getyVal(){
        return yVal;
    }

    public void setxVal(int xVal){
        this.xVal=xVal;
    }

    public void setyVal(int yVal){
        this.yVal=yVal;
    }

    public int moveHorizontally(int xVal){
        this.xVal+=xVal;
        return(this.xVal);
    }

    public int moveVertically(int yVal){
        this.yVal+=yVal;
        return(this.yVal);
    }

    public String translate(int xVal,int yVal)
    {

        return(Integer.toString(this.xVal+xVal) + "," + Integer.toString(this.yVal+yVal));
    }

    public int distanceFromOrigin(){
        return(Math.sqrt(Math.pow(Double.parseDouble(xVal),2)*Math.pow(Double.parseDouble(yVal),2)));
    }
}
