package ForLoop;

public class Array {

    public static void main(String[] args) {
        int[] array = {10, 23, 18, 5, 100, 1,};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }

        }

        for (int i=0;i< array.length;i++){
            System.out.print(array[i]  +"  ");
        }
    }

    }

