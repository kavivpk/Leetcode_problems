class Solution {
    static boolean istrue(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String lon="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(istrue(sub)){
                    if(sub.length()>lon.length()) lon=sub;
                }
            }
        }
        return lon;
    }
}