import java.util.Arrays;

public class ArrCom {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};//5
        int[] arr2 = {3, 5, 7, 9};//4

        //  combined array
        int comLen = arr1.length + arr2.length;//9

        //  new array with the combined length
        int[] output = new int[comLen];//Combined Length= comlen

        for (int i = 0; i < arr1.length; i++) {
            output[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            output[arr1.length + i] = arr2[i];
        }

        //  to Print output
        System.out.println(Arrays.toString(output));
    }
}
