package ForLoop;

public class StaticArray {
    public static void main(String[] args) {

        int []array={1,2,3,4,5};
        int temp=0;
        int []arrays=new int[5];
        arrays[0]=1;
        arrays[1]=2;
        arrays[2]=3;
        arrays[3]=4;
        arrays[4]=5;
         arrays[5]=5;


        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+ "  ");
        }
        for (int i=0;i< arrays.length;i++){
            System.out.print(arrays[i]+"  ");
        }


    }
    }