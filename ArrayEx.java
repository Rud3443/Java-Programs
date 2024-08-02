class ArrayEx{
    //First Method
    public static void main(String[] args) {
        int[] mycount = {1, 2, 3, 4, 5,6,9,44,2,10};  //int arr intializer

        // second method
        String[] myarr=new String[5];  //string array with new keyword
        myarr[0]="Java"; //assign vallue as per index
        myarr[1]="World";
        myarr[2]="Java";
        myarr[3]="Programming";
        myarr[4]="Language";
        System.out.println(myarr[3]); // print value of specified index
        System.out.println(mycount[8]);
        System.out.println(mycount.length); //print length of array
    }
}