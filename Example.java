class Solution {
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0)
        {
            int r=n%10;
            prod=prod*r;
            sum=sum+r;
            n=n/10;
        }
        return prod-sum;
    }


    public static void main(String[] args) {
        int n = 245;
        System.out.println(subtractProductAndSum(n));
    }
    
}
