package lab9_Q2;

import java.util.*;

public class CustomStringTokenizer {

	public static void main(String[] args) {

		StringTokenizer str = new StringTokenizer("Question 02 ");
		int count = TokenCount(str);

		System.out.println("Total number of tokens = " + count);
	}

	static int TokenCount(StringTokenizer st) {

		int count = 0;
		while (st.hasMoreTokens()) {
			boolean status = true;
			try {
				String check = st.nextToken();
				double d = Double.parseDouble(check);
			} catch (NumberFormatException e) {
				status = false;

			}
			if (status != true) {
				count++;
			}
		}
		return count;

	}
}