public class Computer implements IDable {

    private String make,id;
    protected Memory memory;

    public Computer(String id, String make,String memtype,int memSize)
    {
        setID(id);
        setMake(make);
        memory = new Memory(memtype,memSize);
    }

    public Computer() {

    }

    public String  getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public Memory getMemory() {
        return memory;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public void setMemory(Memory mem) {
        this.memory= mem;

    }

    public String toString() {
        return "ID: " + getId() + "\nMake: " + getMake() + "\n\t\tMemory Details\n" + memory.toString();
    }

    public void setID(String id) {
        this.id=id;
    }
}
