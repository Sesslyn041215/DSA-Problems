import java.util.Scanner;

public class ArrayDuplicate {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
     }
     int[] uniqueArray = removeDuplicates(arr);
     for (int i = 0; i < uniqueArray.length; i++) {
         if (uniqueArray[i] != 0) {
             System.out.print(uniqueArray[i] + " ");
         }
     }
 }

 public static int[] removeDuplicates(int[] array) {
     int[] newArray = new int[array.length];
     int currentIndex = 0;

     for (int i = 0; i < array.length; i++) {
         boolean isDuplicate = true;
         for (int j = 0; j < currentIndex; j++) {
             if (array[i] == newArray[j]) {
                 isDuplicate = false;
                 break;
             }
         }
         if (isDuplicate) {
             newArray[currentIndex] = array[i];
             currentIndex++;
         }
     }

     int[] uniqueArray = new int[currentIndex];
    System.arraycopy(newArray, 0, uniqueArray, 0, currentIndex);

     return uniqueArray;
 }
}
