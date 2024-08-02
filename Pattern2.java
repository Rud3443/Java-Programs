// number decreasing pyramid
class Pattern2{
    static void printNumber(int n){
        int i,j;
        //outer loop - rows
        for(i=n;i>=1;i--){
            //inner loop - columns
            for(j=1;j<=i;j++){
                System.out.print(j+" "); //print value
            }
            System.out.println(); //move to next line for each row
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Pattern2.printNumber(n);
    }
}