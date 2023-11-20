package wed27;

import java.util.*;

class InsertAnElement {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int pos = sc.nextInt();
    
     if (pos < 1 || pos >=n ) {
      System.out.println("Invalid Input");
      return;
    }
        int x = sc.nextInt();

    int[] newArray = new int[n + 1];

    for (int i = 0; i < newArray.length; i++) {
      if (i < pos-1) {
        newArray[i] = arr[i];
      } else if (i == pos-1) {
        newArray[i] = x;
      } 
    
      else {
        newArray[i] = arr[i - 1];
      }
    }
    
 System.out.println("Array after insertion is:");
    for (int i = 0; i < newArray.length; i++) {
      System.out.println(newArray[i]);
    }
  }
}