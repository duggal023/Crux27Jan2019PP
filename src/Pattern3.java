
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Feb-2019
 *
 */

public class Pattern3 {

	public static void main(String[] args) {

		int n = 5;
		int nst = n;
		int row = 1;

		while (row <= n) {

			// work
			int col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}

			// prep
			row++;
			nst--;
			System.out.println();

		}

	}

}
