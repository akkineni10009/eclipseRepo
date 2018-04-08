package Strings;

public class Roll_Characters {
 static final int MAX_CHAR = 26;

 static StringBuffer findRollOut(StringBuffer s,
                               int arr[], int n) {

     int brr[] = new int[n + 1];
     for (int i = 0; i < n; i++) {
         brr[0] += 1;
         brr[arr[i]] -= 1;
     }
     for (int i = 1; i < n; i++)
         brr[i] += brr[i - 1];

     char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f', 
                   'g', 'h', 'i', 'j', 'k', 'l',
                   'm', 'n', 'o', 'p', 'q', 'r', 
                   's', 't', 'u', 'v', 'w', 'x',
                   'y', 'z' };
      
     for (int i = 0; i < n; i++) {
         int x = brr[i] % MAX_CHAR;
         int y = s.charAt(i) - 'a';
         s.deleteCharAt(i);
         s.insert(i, ch[(x + y) % MAX_CHAR]);
     }
     return s;
 }

 public static void main(String args[]) {
     String s = "zcza";
     StringBuffer str = new StringBuffer(s);
     int n = str.length();

     // roll array
     int roll[] = { 1, 1, 3, 4 };
     StringBuffer res = findRollOut(str, roll, n);
     System.out.println(res);
 }
}