class RomanToInt {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        //String s = "LVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int totalValue=0;
        boolean status=true;
        //first i stat
        int index=1;
        while(status==true){
            try {
                int beforeValue = romanValue(s.charAt(index - 1));
                int indexValue = romanValue(s.charAt(index));
                if (beforeValue < indexValue) {
                    if(index==s.length()-1)
                        status=false;
                    totalValue += (indexValue - beforeValue);
                    index+=2;
                }
                else{
                    if(index==s.length())
                        status=false;
                    totalValue += beforeValue;
                    index++;
                }

            }
            catch(Exception e){
                status=false;
                totalValue+=romanValue(s.charAt(s.length()-1));
            }
        }
        return totalValue;
    }

    static int romanValue(char c){
        int number=0;
        switch(c){
            case 'I':
                number= 1;
                break;
            case 'V':
                number= 5;
                break;
            case 'X':
                number= 10;
                break;
            case 'L':
                number= 50;
                break;
            case 'C':
                number= 100;
                break;
            case 'D':
                number= 500;
                break;
            case 'M':
                number= 1000;
                break;
            default:
                break;
        }
        return number;
    }
}