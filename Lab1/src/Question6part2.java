public class Question6part2 {
    public static void main(String[] args) {

        String output = String.format("%-20s%s\n%-20s%s", "Number", "Cube", "\n------", " ----\n");

        for(int i=1;i<=15;i++)
        {
            output += String.format("%-20s%.0f\n",i,MyMethods.cube(i));
        }

        System.out.println(output);


    }


}


