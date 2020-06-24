import java.util.Scanner;

public class RecursiveMethods
{
   public static void main(String [] args)
   {
     int[] a = {2, 3, 4, 5, 6, 7, 8};
     System.out.println(oddEvenMatchRec(a));
     int[] b = {1, 2, 3, 4, 5, 6, 7};
     System.out.println(oddEvenMatchRec(b));
     System.out.println(sumNRec(5));
     nDownToOne(6);
     inputAndPrintReverse();
   }


   public static boolean oddEvenMatchRec(int [] A)
   {
      return oddEvenMatchRec(A, 0, A.length - 1);
   }

   private static boolean oddEvenMatchRec(int [] A, int index, int high)
   {
      //Complete this method as required. USE RECURION!
      if (index == high + 1) {
        return true;
      } else if ((index == 0 || index % 2 == 0) && A[index] % 2 == 0) {
        return oddEvenMatchRec(A, index + 1, high);
      } else if ((index != 0 && index % 2 != 0) && A[index] % 2 != 0) {
        return oddEvenMatchRec(A, index + 1, high);
      } else {
        return false;
      }
   }

   // public static int sumNRec(int [] A)
   // {
   //    return sumNRec(A, 0, A.length - 1);
   // }

   private static int sumNRec(int n) //modified this because the instructions say that it takes an int, not an int[]
   {
      //Complete this method as required. USE RECURION!
      if (n == 1) {
        return 1;
      } else {
        return sumNRec(n - 1) + n;
      }
   }

   public static void nDownToOne(int n)
   {
      if (n == 1) {
        System.out.println(1);
      } else {
        System.out.println(n);
        nDownToOne(n - 1);
      }
   }

   public static void inputAndPrintReverse()
   {
      // NO ARRAYS or ARRAY like structures here
      Scanner kbd = new Scanner(System.in);
      int n;
      //Complete this method as required. USE RECURION!
      System.out.print("Enter an int: ");
      n = kbd.nextInt();
      if (n == 0) {
        System.out.println(0);
      } else {
        inputAndPrintReverse(); // im assuming that reverse order means reverse from how the user input it, not in descending order (4, 3, 2, 1)
        System.out.println(n);
      }
   }
} // end class
