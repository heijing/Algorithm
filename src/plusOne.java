public class plusOne {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0 || digits == null){
            return digits;
        }
        int[] res = new int[digits.length+1];
        int carry = 1;
        for(int i = digits.length-1;i>=0;i--){
            int digit = (digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            digits[i] = digit;
            if(carry == 0){
                return digits;
            }
        }
        if(carry !=0){
            res[0] = carry;
        }
          return res;
    }
}