import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]array = {3,4,5,6,7,8,9,1,2};

        System.out.println(Arrays.toString(array));
        System.out.println("Enter your number");
        int X = input.nextInt();

        int index=0;
        int i;
        for (i =0;i<array.length;i++){
            if (array[i] == X){
                index = i;

                System.out.println("\n"+"number X at: "+ (index+1));
                for (int j = index; j<array.length-1; j++){
                    array[j]=array[j +1];
                }
                array[array.length-1] = 0;

                System.out.println("Before: " + Arrays.toString(array));
                break;
            }
//            else {
//                System.out.println("Not have.");
//            }
        }
        if (i == array.length){
            System.out.println("Not have.");
        }

//        for (int i = 0; i<array.length;i++){
//            if (array[i] != X){
//
//            }
//        }
    }
}
