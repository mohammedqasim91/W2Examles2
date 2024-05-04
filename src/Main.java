import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        System.out.println("input: " + Arrays.toString(numbers));

        //proceed to iterate over that array and update each position
        // by multiplying that value by the value of the next position.
        // The last position must be multiplied by the first position of the array.

        int lastPosition = numbers[numbers.length-1] * numbers[0];

        for (int i=0; i<numbers.length-1; i++) {
            numbers[i] = numbers[i]*numbers[i+1];
        }

        numbers[numbers.length-1] = lastPosition;
        for (int number: numbers) {
            System.out.println(number);
        }


        // proceed to iterate over that array and
        // create an inverted version of it in a new variable.
        int[] invertedArray = new int[numbers.length];

        for (int i=0; i< numbers.length; i++) {
            int index = numbers.length-1;
            invertedArray[i] = numbers[index-i];
        }
        for (int number: invertedArray) {
            System.out.println(number);
        }

    }
}