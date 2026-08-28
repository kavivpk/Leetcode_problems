class Solution {
    public int maxProduct(int[] num) {
        int cur=num[0];
        int min=num[0];
        int max=num[0];
        for(int i=1;i<num.length;i++){
            int temp=cur;
            cur=Math.max(num[i],Math.max(cur*num[i],min*num[i]));
            min=Math.min(num[i],Math.min(temp*num[i],min*num[i]));
            max=Math.max(cur,max);
        }
        return max;
    }
}