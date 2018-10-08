import java.util.Arrays;
import javax.swing.JOptionPane;


public class githubtest {
	public static void main(String[] args) {
		
		
		int sekunder = 3661;
		
		int timmar =sekunder / 3600;
		
		int rest = sekunder %3600;
		
		int minuter = rest/60;
		
		int s = rest %60;
		
		System.out.println(timmar+":"+minuter+":"+s);
	}
}
