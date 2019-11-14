class Solution {
    
    public static void reverseString(char[] s) {
        helper(0 , s);    
    }
    
    private static void helper(int index, char[] s){
        if(s.length==0 || index >= s.length /2){
            return;
        }
        swap(index, s.length-1-index, s);
        helper(index+1, s);
    }
    
    private static void swap(int i, int j, char[] s){
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}
