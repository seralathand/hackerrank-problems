class PlusOne {

    public static void main(String[] args) {
       int digits[]={1,2,3};
       //int digits[]={4,3,2,1};
        System.out.println(plusOne(digits));
    }
    public static int[] plusOne(int[] digits) {
        for(int index=digits.length-1;index>=0;index--){
            if(digits[index]!=9){
                digits[index]++;
                return digits;
            }
            else
                digits[index]=0;
        }
        int newArr[]=new int[digits.length+1];
        newArr[0]=1;
        return newArr;
    }
}