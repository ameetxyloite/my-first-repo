public class Methods{
    static void myFunction1(){
        System.out.println("Function 1");        //static method
    }
    public void myFunction2()
    {
        System.out.println("Function 2");        //instance method
    }
public static void main(String[] args) {

    Methods fun1=new Methods();                    //object
    fun1.myFunction2();
    myFunction1();
}
}
// This is the additional changes that was created to check the merge
