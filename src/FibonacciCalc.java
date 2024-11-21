

public class FibonacciCalc {
    public int  fibu(int n){
        if(n<=1)
            return n;
        else{
            return fibu(n-1) + fibu(n-2);
        }

}
}
