package ReffernceVariable;

public class PageNation1 {
    public static void main(String[]args){
        int [] a ={1,2,3,4,5};
       int  PageSize=2;
       int  Pageindex=a.length/2;

        for (int i=0;i<PageSize;i++){
            for (int j=i*PageSize;j<PageSize+(i*PageSize);j++){
                System.out.println("  i "+i+" j "+j);
            }
        }
    }
}
