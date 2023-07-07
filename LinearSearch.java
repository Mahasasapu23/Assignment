import java.util.Arrays;
public class LinearSearch {
    static int search(int[] arr, int x) {
for (int i = 0; i < arr.length; i++) {
if (arr[i] == x)
return i;
}
return -1;
}
public static void main(String[] args) {
int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
Arrays.sort(array);   
LinearSearch linear = new LinearSearch();
int result = linear.search(array, 109);
if (result == -1)
System.out.println("Element not present");
else
System.out.println("Element found at index " + result);
}
}