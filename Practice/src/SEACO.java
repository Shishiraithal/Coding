import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class SEACO {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0].trim());
			int m = Integer.parseInt(str[1].trim());

			Range arr[] = new Range[m + 1];
			ArrayList<Range> starts = new ArrayList<>();
			ArrayList<Range> ends = new ArrayList<>();

			ArrayList<Range> type2 = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				str = br.readLine().trim().split(" ");
				int type = Integer.parseInt(str[0].trim());
				arr[i + 1] = new Range(type, Integer.parseInt(str[1].trim()), Integer.parseInt(str[2].trim()), 1);
				if (type == 1) {
					starts.add(arr[i + 1]);
					ends.add(arr[i + 1]);
				} else
					type2.add(arr[i + 1]);
			}
			for (int i = type2.size() - 1; i >= 0; i--) {
				Range current = type2.get(i);
				for (int rangeInd = current.start; rangeInd <= current.end; rangeInd++) {
					arr[rangeInd].count += current.count;
				}
			}
			Collections.sort(starts, new Comparator<Range>() {
				public int compare(Range s1, Range s2) {
					return s1.start < s2.start ? -1 : 1;
				}
			});
			Collections.sort(ends, new Comparator<Range>() {
				public int compare(Range s1, Range s2) {
					return s1.end < s2.end ? -1 : 1;
				}
			});
			// System.out.println("starts "+starts);
			// System.out.println("ends " + ends);
			int startInd = 0, endIndex = 0, len = starts.size();
			long csum = 0;
			for (int i = 1; i <= n; i++) {
				while ((startInd < len && i == starts.get(startInd).start)) {
					csum = (csum + starts.get(startInd).count);
					startInd++;
				}
				while ((endIndex < len && (i - 1) == ends.get(endIndex).end)) {
					csum = (csum - ends.get(endIndex).count);
					endIndex++;
				}
				pw.print((csum % 1000000007) + " ");
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}
}

class Range {
	int start, end, type;
	long count;

	Range(int type, int s, int e, long c) {
		this.type = type;
		this.start = s;
		this.end = e;
		this.count = c;
	}

	@Override
	public String toString() {
		return "Range [start=" + start + ", end=" + end + ", count=" + count + ", type=" + type + "]";
	}

}
