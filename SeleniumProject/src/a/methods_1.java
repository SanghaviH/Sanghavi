package a;

class Example2 {
    public void addition(int arr[],int num) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if((arr[i] + arr[j]) == num) {
                    System.out.println(arr[i]+" +" +arr[j] +"="+ num);
                }
            }
        }
    }
}

public class methods_1 {
    public static void main(String[] args) {
        Example2 ex = new Example2();
        int arr[] = {1,2,3,4,5,6,7};
        ex.addition(arr,10);
    }
}
