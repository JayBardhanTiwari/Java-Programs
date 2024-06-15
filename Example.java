public class Example {
    public static int compare(int heights[]) {

      
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            largest = Math.max(largest, heights[i]);

        }
        int exprexted[] = new int[largest + 1];
        for (int i = 0; i < heights.length; i++) {
            exprexted[heights[i]]++;

        }
        //sorting
        int j= 0;
        int count = 0;
        for(int i = 0;i<exprexted.length;i++){
            while(exprexted[i]>0){
                heights[j] = i;
                j++;
                exprexted[i]--;
                if(heights[i] != exprexted[i]){
                    count++;
                }
            }
        }
       
     
        return count;

    }

    public static void printarray(int heights[]) {
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
    }

    public static void main(String[] args) {
        int heights[] = { 1, 1, 4, 2, 1, 3 };
        System.out.println(compare(heights));
    }
}