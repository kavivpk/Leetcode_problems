class Solution {
    public int[] sortArrayByParity(int[] num) {
        int a=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                int temp=num[a];
                num[a]=num[i];
                num[i]=temp;
                a++;
            }
        }
        return num;
    }
}