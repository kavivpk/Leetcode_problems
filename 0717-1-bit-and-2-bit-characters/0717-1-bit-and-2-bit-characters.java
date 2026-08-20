class Solution {
    public boolean isOneBitCharacter(int[] bit) {
        int n=bit.length;
        int i=0;
        while(i<n-1){
            i+=1+bit[i];
        }
        return i==n-1;
    }
}