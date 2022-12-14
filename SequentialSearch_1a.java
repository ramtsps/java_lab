import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearch_1a {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        System.out.println("Enter the target value");
        System.out.println(Arrays.toString(exampleVariableOne));
        int g=sc.nextInt();
        int target = g;
        sequentialSearch(exampleVariableOne, target);
    }

    public static void sequentialSearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        // searches each index of the array until it reaches the last index
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                // if the target is found, int index is set as the value of i and
                // the for loop is terminated
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Your target integer does not exist in the array");
        } else {
            System.out.println("Your target integer is in index " + index + " of the array");
        }
    }
}