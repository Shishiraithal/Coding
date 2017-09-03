import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TimeConversion {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		String str = br.readLine().trim();
		String flag = str.substring(str.length() - 2);
		str = str.substring(0, str.length() - 2);
		//System.out.println(flag + " " + str);
		String split[] = str.split(":");
		int hh = Integer.parseInt(split[0]);
		int mm = Integer.parseInt(split[1]);
		int ss = Integer.parseInt(split[2]);
		if (flag.equals("PM")) {
			// pw.print("12:00:00");
			if (hh != 12) {
				hh += 12;
			}
			pw.print(hh + ":" + split[1] + ":" + split[2]);
		} else if (flag.equals("AM")) {
			if (hh == 12) {
				split[0] = "00";
			}
			pw.print(split[0] + ":" + split[1] + ":" + split[2]);
		}
		pw.println();
		pw.flush();
		pw.close();
	}
}
