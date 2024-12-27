public class newArray {
    public static void main(String[] args) {
        int [] myArr = new int [5];
//       int myArr= {98,94,93,92,91};
        myArr[0]=98;
        myArr[1]=94;
        myArr[2]=93;
        myArr[3]=92;
        myArr[4]=91;
        int i=0;
        // array traversal;
        while (i<myArr.length)
        {
            System.out.println(myArr[i]);
            i++;
        }


    }
}
