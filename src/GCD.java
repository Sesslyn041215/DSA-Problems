
public class GCD {
   public static void main(String[] args) {
	int n1 = 98;
	int n2 = 28;
    while (n2 != 0) {
        int temp = n2;
        n2 = n1 % n2;
        n1 = temp;
    }
   System.out.println(n1);

}
}
