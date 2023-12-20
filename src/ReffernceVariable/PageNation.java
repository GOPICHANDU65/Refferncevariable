package ReffernceVariable;

public class PageNation {
    public static void main(String[] args) {
        int[] arr = new int[50];

        for (int i = 0; i < 50; i++) {
            arr[i] = i + 1;
        }

        int maxPages = 9;
        displayPages(arr, maxPages);
    }
    public static void displayPages(int[] arr, int maxPages) {
        if (maxPages <= 0) {
            System.out.println("Maximum elements per page should be greater than 0.");
            return;
        }

        int numOfPages = (arr.length + maxPages - 1) / maxPages;
        int currentIndex = 0;

        for (int i = 0; i < numOfPages; i++) {
            System.out.println("Page " + (i + 1) + ":");

            int elementsOnThisPage = Math.min(maxPages, arr.length - currentIndex);

            for (int j = 0; j < elementsOnThisPage; j++) {
                System.out.println(arr[currentIndex]);
                currentIndex++;
            }

            System.out.println();
        }
    }
}





