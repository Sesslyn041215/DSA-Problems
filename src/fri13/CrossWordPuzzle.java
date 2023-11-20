package fri13;

import java.util.*;

class CrossWordPuzzle {
	public static void runn(int n, int u, int r, int d, int l) {
		for (int i = 0; i < 16; i++) {
			int tu = u, tr = r, td = d, tl = l;

			if ((i & 8) == 0) {
				tu--;
				tl--;
			}
			if ((i & 4) == 0) {
				tu--;
				tr--;
			}
			if ((i & 2) == 0) {
				tr--;
				td--;
			}
			if ((i & 1) == 0) {
				tl--;
				td--;
			}
			int um = Math.min(tu, tr);
			int ut = Math.min(td, tl);
			int mn = Math.min(um, ut);
			int lk = Math.max(tu, tl);
			int qw = Math.max(tr, td);
			int mx = Math.max(lk, qw);
			if (mn >= 0 && mx <= n - 2) {
				System.out.print("YES\n");
				return;
			}
		}
		System.out.print("NO\n");
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int po = 0; po < t; po++) {
			int n = s.nextInt();
			int u = s.nextInt();

			int r = s.nextInt();
			int d = s.nextInt();
			int l = s.nextInt();
			runn(n, u, r, d, l);
		}
	}
}
