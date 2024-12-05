package TDD;

public class WhiteBox {
    int []arr={2,-5,3,6,9};
    int size=5;
    public static int sumPositive(int arr[], int size){
        int sum=0;
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        WhiteBox wb = new WhiteBox();
        int sum= wb.sumPositive(wb.arr,wb.size);
        System.out.println(sum);
    }
}