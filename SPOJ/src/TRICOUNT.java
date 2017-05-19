import java.io.*;
class TRICOUNT {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		int t = Integer.parseInt(br.readLine());
		while (t-->0) {
			long val = Long.parseLong(br.readLine());
			pw.println((val * (val + 2) * (2 * val + 1)) / 8);
		}
		pw.flush();
		pw.close();
	}
}
