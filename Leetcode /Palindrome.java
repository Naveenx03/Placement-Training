class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y=x;
        while(x>0){
            int digit=x%10;
            x=x/10;
            rev=rev*10+digit;
        }
        if(rev==y){
            return true;
        }
        else{
            return false;
        }
    }
}
