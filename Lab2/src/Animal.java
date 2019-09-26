public class Animal {

    private String type;
    private String[] continents;// = new String[7];
    private double weight;
    private int age;

    public Animal(){

        Animals("No Type Specified",null,0.0,0);
    }

    public void Animals(String type,String[] continents,double weight,int age){

        this.type = type;
        this.continents = continents;
        this.weight = weight;
        this.age = age;

    }

    public void Mutate(String type,String[] continents,double weight,int age){
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public String getType()
    {
        return type;
    }

    public String[] getContinents()
    {
        return continents;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        String continentMessage = "";
        if(continents==null)
        {
            continentMessage = "Oh no! This animal is extinct!!";
        }
        else
        {
            for(int i=0;i<continents.length;i++)
            {
               continentMessage+=continents[i] + " ";
            }
        }

        return("Type: " + getType() + "\nContinents: " + continentMessage + "\nWeight: " + getWeight() + "\nAge: " + getAge());
    }
}
