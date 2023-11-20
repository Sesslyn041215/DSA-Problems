package tues10;

//Given a permutation of numbers from 1 to N. Among all the subarrays, find the
//number of unique pairs (a,b) such that a≠b and a is maximum and b is second
//maximum in that subarray.
//Sample Input:
//5
//1 2 3 4 5
//Sample Output:
//4
//Explanation:
//All the possible subarrays are:
//1
//12
//123
//1234
//12345
//2
//23
//234
//2345
//3
//34
//345
//4
//45
//
//5
//The 4 unique pairs are:
//(2,1)
//(3,2)
//(4,3)
//(5,4)

import java.util.*;

class Pair {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair pair = (Pair) obj;
        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}

public class UniquePairs {
    static Set<Pair> pairs(int[] arr) {
        Set<Pair> pairs = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int maximum = Math.max(arr[i], arr[i + 1]);
            int secondmax = Math.min(arr[i], arr[i + 1]);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maximum) {
                    secondmax = maximum;
                    maximum = arr[j];
                } else if (arr[j] < maximum && arr[j] > secondmax) {
                    secondmax = arr[j];
                }
                pairs.add(new Pair(secondmax, maximum));
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vec = new int[n];
        for (int i = 0; i < n; i++) {
            vec[i] = sc.nextInt();
        }

        Set<Pair> st = pairs(vec);
        System.out.println(st.size());
    }
}




