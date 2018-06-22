import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedR {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int k=Integer.parseInt(br.readLine());
        System.out.println(k);
    }
}