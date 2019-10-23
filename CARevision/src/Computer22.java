public class Computer22 implements IDable22 {
    private String id,make;
    protected Memory22 mem;

    public Computer22(){
        setID("Unknown ID");
        setMake("Unknown Make");
        setMem("Unknown Type",0);
    }

    public Computer22(String id, String make, String memType, int memSize){
        setID(id);
        setMake(make);
        setMem(memType,memSize);
    }

    public String getID() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public Memory22 getMem() {
        return mem;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMem(String memType, int memSize) {
        this.mem = new Memory22(memType,memSize);
    }


    public String toString() {
        return "Device ID: " + getID() + "\nDevice Make: " + getMake() + "\n" + mem.toString();
    }

    public void setID(String id) {
        this.id = id;
    }
}
