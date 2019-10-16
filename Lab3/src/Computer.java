public class Computer implements IDable {

    private int id;
    private String make;
    private Memory memory;

    public Computer(String id, String make, String memType, int memSize)
    {
        setID(id);
        setMake(make);
        setMemType(memType);
        setMemSize(memSize);
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public Memory getMemory() {
        return memory;
    }
}
