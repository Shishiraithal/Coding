import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class DS_LinkedList {
	public static void main(String[] args) throws Exception {

		Node head = null, tmp;

		for (int i = 1; i < 5; i++) {
			tmp = new Node(i);
			if (head == null) {
				head = tmp;
			} else {
				/*Node t=head;
				while(t.link!=null){
					t=t.link;
				}
				t.link=tmp;*/
				tmp.link=head;
				head=tmp;
			}
			System.out.println(i+" in");
		}
		Node t=head;
		while(t!=null){
			System.out.println(t.val);
			t=t.link;
		}
	}
}

class Node {
	Node link;
	int val;

	Node(int v) {
		link = null;
		val = v;
	}
}

class LinkedList {

}
