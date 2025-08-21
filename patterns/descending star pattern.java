import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n,r,c;
		n = ob.nextInt();
		for(r=0; r<n; r++) {
			for(c=0; c<n-r-1; c++) {
			    System.out.print(" ");
			}
			for(c=0;c<n;c++){
			    System.out.print("*");
			}
			System.out.println();
		}
	}
}