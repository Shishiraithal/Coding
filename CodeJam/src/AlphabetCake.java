import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class AlphabetCake {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		int caseInd = 1;
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			// code
			StringBuffer s = new StringBuffer(str[0].trim());
			int r = Integer.parseInt(str[0].trim());
			int c = Integer.parseInt(str[1].trim());

			ArrayList<Character> arL = new ArrayList<>();
			char arr[][] = new char[r][c];
			int j = 0;
			int _r = r, _c = c;
			HashMap<Character, HashMap<Integer, Integer>> map = new HashMap<Character, HashMap<Integer, Integer>>();
			while (r-- > 0) {
				String str1 = br.readLine().trim();
				int k = 0;
				for (char ss : str1.toCharArray()) {
					arr[j][k] = ss;
					if (ss != '?' && !arL.contains(ss))
						arL.add(ss);
					if (ss != '?') {
						if (!map.containsKey(ss))
							map.put(ss, new HashMap<>());
						map.get(ss).put(j, k);
					}
					k++;
				}
				j++;
			}
			System.out.println(Arrays.deepToString(arr));
			updateArray(arr, map);
			System.out.println(Arrays.deepToString(arr));
			for (int i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {

				}
			}

			// System.out.println(Arrays.deepToString(arr));
			// System.out.println(arL);
			pw.println("Case #" + (caseInd++) + ":");
			int arIn = 0;
			for (j = 0; j < _r; j++) {
				for (int k = 0; k < _c; k++) {
					if (arr[j][k] == '?') {
						pw.print(arL.get(arIn));
						arIn++;
						if (arIn == arL.size())
							arIn = 0;

					} else
						pw.print(arr[j][k]);
					// System.out.println("in");
				}
				pw.println();
				// System.out.println("oo");
			}

		}

		pw.flush();
		pw.close();
	}

	private static void updateArray(char[][] arr,
			HashMap<Character, HashMap<Integer, Integer>> map) {

		Iterator<Character> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			char now = keys.next();
			if (map.get(now).size() > 1) {
				HashMap<Integer, Integer> hm = map.get(now);
				int minr = 100, minc = 100, maxr = -1, maxc = -1;
				Iterator<Integer> keys1 = hm.keySet().iterator();
				while (keys1.hasNext()) {
					int keyt = keys1.next();
					if (minr > keyt)
						minr = keyt;
					if (maxr < keyt)
						maxr = keyt;
				}
				keys1 = hm.values().iterator();
				while (keys1.hasNext()) {
					int keyt = keys1.next();
					if (minc > keyt)
						minc = keyt;
					if (maxc < keyt)
						maxc = keyt;
				}
				for (int i = minr; i <= maxr; i++)
					for (int j = minc; j <= maxc; j++)
						arr[i][j] = now;
			}
		}

	}
}
