import java.util.Arrays;

public class CreateArrays {
    public static void main(String[] args) {

        //declaration and initialization of array classes
        int [] numbers = {1, 21, 63, 4, 51};
        String [] str = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        char [] ch1 = {'a', 'e', 'i', 'o', 'u'};
        boolean [] bln = {true, false};

        // print Numbers array
        System.out.println("Numbers: " + Arrays.toString(numbers));

        // print Strings array
        System.out.println("Strings: " + Arrays.toString(str));

        //print characters array
        System.out.println("Characters: " + Arrays.toString(ch1));

        //print boolean array
        System.out.println("Booleans: " + Arrays.toString(bln));
    }
}
