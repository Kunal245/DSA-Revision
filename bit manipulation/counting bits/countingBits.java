class Solution {
    public int[] countBits(int n) {

        //idr ye logic hai ki agr odd number rah toh jo uske half me number of 1's hai
        //unse 1 jyada rahega
        //aur agr even hai toh uske adhne number ka number of 1's rahega
        //initially 0 ka 0 hai ye add krna padega baaki toh previous result use kr dakte hai 
        //TC - O(n)
        

        // ArrayList<Integer> ans = new ArrayList<>(n+1);
        int[] ans = new int[n+1];

        ans[0] = 0;

        for(int i=0 ; i<ans.length ; i++){

            if(i % 2 != 0){
                ans[i] = ans[i/2] + 1;
            } else {
                ans[i] = ans[i/2];
            }
        }

        return ans;
    }
}