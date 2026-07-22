class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int ans = 1;
        while(n > 0)
        {
            int dig = n % 10;
            sum = sum + dig;
            ans = ans * dig;
            n = n / 10;
        }
        return ans - sum;
    }
}