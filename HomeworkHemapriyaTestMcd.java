
// student Name : hema priya

public class HomeworkHemapriyaTestMcd {

    // returns the minimmum common denominator
    public static int mcd(int a, int b) {
	if(a==b)
	    return a;
	else if (a>b) 
	    return mcd(a-b,b);
	else
	    return mcd(b-a,a);
    }

    public static int largest(int arr[]){
	assert(arr.length>0);
	int curLargest=arr[0];
	for(int i=1; i<arr.length; ++i) {
	    if(arr[i]>curLargest) 
		curLargest=arr[i];
// display the content of the array arr
	}
	return curLargest;
    }

    public static void main(String args[]) {
	int arr[]={1,3,4,5,6,7,15,13,2};
System.out.println("Hello Se, I am Hemapriya");

System.out.println("The content of arr is:");
int n=arr.length;
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
//arr[i]=sc.nextInt(); 
System.out.print(arr[i]+"  "); 
}  
System.out.println();
System.out.println("*******************************");

	System.out.println("The largest value in arr is "+largest(arr));
	
    }
}
