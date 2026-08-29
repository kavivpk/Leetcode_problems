class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hour, int target) {
        int count =0;
        for(int i=0;i<hour.length;i++){
                if(target<=hour[i]){
                    count++;
                }
        }
        return count;
    }
}