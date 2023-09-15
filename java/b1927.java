import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class b1927 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int n = Integer.parseInt(br.readLine());
																																																																																																																																																																																																								
		for(int i=0;i<n;i++) {
			int num=Integer.parseInt(br.readLine());
			if(num==0) {
				if(queue.isEmpty()) {
					bw.write(0+"\n");
				}else bw.write(queue.poll()+"\n");
			}else {
				queue.offer(num);				
			}
		}
		bw.flush();
		bw.close();
		br.close();
				
	}

}
