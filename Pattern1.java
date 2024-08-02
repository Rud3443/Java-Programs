// number increasing pyramid
class Pattern1{
    static void printNumber(int n){
        int i,j;
        //outer loop - rows
        for(i=1;i<=n;i++){
            //inner loop - columns
            for(j=1;j<=i;j++){
                System.out.print(j+" "); //print value
            }
            System.out.println(); //move to next line for each row
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Pattern1.printNumber(n);
    }
}