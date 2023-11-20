package LeaveProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//You are having a list of comedians in front of you in which one is having a duplicate id. Find him and tell his name!

public class ListOfComedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> comediansSet = new HashSet<>();
        ArrayList<String> duplicateList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String comedian = sc.nextLine();

            if (!comediansSet.add(comedian)) {
                duplicateList.add(comedian);
            }
        }

        if (duplicateList.size() != 0) {
            System.out.print("The duplicate comedians are: " + duplicateList);
        } else {
            System.out.println("No duplicate comedians found.");
        }
    }
}

