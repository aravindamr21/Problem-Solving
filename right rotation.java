/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {3, 4, 2, 5, 7, 8};
        int n = arr.length;
        int k = 3;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int t = arr[n-1];
            for (int j = n-1; j >0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = t;
        }
        System.out.println(Arrays.toString(arr));
	}
}
