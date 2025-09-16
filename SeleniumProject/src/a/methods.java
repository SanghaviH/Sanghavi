package a;

class Example1 {      //define a class
    public void addition(int arr[], int num) {  // inside method called addition
        for (int i=0; i < arr.length; i++) {  //takes an array arr[] of integers,an intejar num
            for (int j=i+1; j < arr.length; j++) { //nested loop to find pairs
                if ((arr[i] + arr[j]) == num) { //conditions checks
                    System.out.println(arr[i] + " +" + arr[j] + " =" + num);//matching pair
                   }
              }
           }
        }
   }
public class methods { //main method
    public static void main(String[] args) {
        Example1 ex = new Example1();
        int arr[] = {1,2,3,4,5,6,7};
        ex.addition(arr,10);
    }
}