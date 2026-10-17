class Solution {
    int convert(char i){
        switch(i){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return -1;
        }
    }
    public int romanToInt(String s) {
        int i = s.length() - 1;
        int sum = 0;
        while(i >= 0){
            char ch = s.charAt(i);
            int val = 0;
            if(i != 0 && convert(s.charAt(i)) > convert(s.charAt(i-1))){
                val = convert(s.charAt(i)) - convert(s.charAt(i-1));
                i -= 2;
            }else{
                val = convert(s.charAt(i));
                i--;
            }
            sum += val;
        }
        return sum;
    }
}