/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        List<Integer> set3 = new ArrayList<>();
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean flag = false;
        boolean flag1 = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (!flag) {
                    set1.add(arr[i]);
                    flag = true;
                }
            } else if (arr[i] == 0) {
                 set2.add(arr[i]);
                 flag1=true;
               
            } else {
                set3.add(arr[i]);
            }
        }
        
        if (!flag) {
            set3.add(-1);
        }
         if (!flag1) {
            set2.add(0);
                    
                }
        
        System.out.println(set1);
        System.out.println(set3);
        System.out.println(set2);
	}
}
