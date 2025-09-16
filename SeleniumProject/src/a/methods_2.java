package a;

class Example3 {
    //Q:write a method to add the numbers are return the result?
    public int addition() {
        int result = 10 + 20;
        System.out.println("Addition:" + result);
        return result;
    }
}
public class methods_2 {
    public static void main(String[] args) {
        Example3 ex = new Example3();
        int result = ex.addition();
    }
}

