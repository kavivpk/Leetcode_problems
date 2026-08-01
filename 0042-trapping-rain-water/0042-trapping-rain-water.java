class Solution {
    public int trap(int[] hei) {
        int l=0;
        int r=hei.length-1;
        int lm=hei[l];
        int rm=hei[r];
        int wat=0;
        while(l<r){
            if(lm<rm){
                l++;
                lm=Math.max(lm,hei[l]);
                wat+=lm-hei[l];
            }
            else{
                r--;
                rm=Math.max(rm,hei[r]);
                wat+=rm-hei[r];
            }
        }
        return wat;
    }
}