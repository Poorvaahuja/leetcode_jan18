class Solution {
    int res = 0;

    public int maxProduct(String s) {
        char[] arr = s.toCharArray();
        dfs(arr, 0, "", "");
        return res;
    }
    public void dfs(char[] arr, int i, String s1, String s2){
        if(i >= arr.length){
            if(isPalindrome(s1) && isPalindrome(s2))
                res = Math.max(res, s1.length() * s2.length());
            return;
        }
        dfs(arr, i+1, s1+arr[i], s2);
        dfs(arr, i+1, s1, s2+arr[i]);
        dfs(arr, i+1, s1, s2);
    }
    public boolean isPalindrome(String s){
        int j= s.length() -1;
        char[] strArr = s.toCharArray();
        for(int i=0; i<j; i++){
            if(strArr[i] != strArr[j])
                return false;
            j--;
        }
        return true;
    }
}
