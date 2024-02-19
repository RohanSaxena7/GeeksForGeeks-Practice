class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        long i = Long.parseLong(str);
        long decimal = 0;
        long power = 0;
        
        while (i>0){
            long lastdigit = i%10;
            decimal = decimal + (long)(lastdigit * Math.pow(2,power));
            power++;
            i = i/10;
        }
        return (int)decimal;
    }
}
