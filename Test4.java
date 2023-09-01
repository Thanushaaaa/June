1.Finding the largest element in the array
class Test4
{
    static int arr[] = {13,45,98,76,234};
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
                return max;
    }
public static void main(String[] args)
{
     System.out.println("Largest number is "+max);
}
}



3. Finding second largest element in the array

public class Test6 {
   public static int secondLargest(int[] a) {
      int temp;
      for (int i = 0; i < a.length; i++) {
         for (int j = i + 1; j < a.length; j++) {
            if (a[i] > a[j]) {
               temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
         }
      }
      return a[a.length-2];
   }
   public static void main(String args[]) {
      int[] a = { 23,98,45,54,19,33,16};
      System.out.println("Second Largest element in the array is " +secondLargest(a));
   }
}

4.Program to find if give number is a perfect square

public class PerfectNumber  
{  
public static void main(String args[])    
{  
long n=156, sum=0;       
System.out.print("Enter the number: ");   
int i=1;  
while(i <= n/2)  
{  
if(n % i == 0)  
{  
  
sum = sum + i;  
}   
i++;  
} 
if(sum==n)  
{  
System.out.println(n+" is a perfect number");  
}  
else    
System.out.println(n+" is not a perfect number");   
}  
}  


2. Program to remove duplicate elements from an array

public class DeleteElement {
   public static void main(String args[]) {

      int[] container = {23,90,15,30,88};
     
      for(int i=0; i<container.length; i++) {
         for (int j=i+1; j<container.length; j++) {
            if(container[i] == container[j]) {
               container = ArrayUtils.remove(container, j);
            }
         }
      }
      System.out.println("Array after removing elements ::"+Arrays.toString(container));
   }
}

7.Printing pattern

public class Pattern1{

	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		    for(int i=1;i<=5;i++){
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}


	
