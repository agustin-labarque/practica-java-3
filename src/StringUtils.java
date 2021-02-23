public class StringUtils {

    public static String rpad(String s, char c, int n){
        return s + replicate(n, String.valueOf(c));
    }

    public static String ltrim(String s){
        int i = 0;
        while(s.substring(i,i+1).equals(" ")){
            i++;
            if(i==s.length()){
                return "";
            }
        }
        return s.substring(i, s.length());
    }

    public static String rtrim(String s){
        int i = s.length()-1;
        while(s.substring(i, i+1).equals(" ")){
            i--;
            if(i==-1){
                return "";
            }
        }
        return s.substring(0, i+1);
    }

    public static String trim(String s){
        return ltrim(rtrim(s));
    }

    public static String replicate(int repetition, String character){
        String myString = "";
        for(int i=0; i<repetition; i++){
            myString += character;
        }
        return myString;
    }

    public static int indexOfN(String s,char c,int n){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(c == s.charAt(i)){
                count++;
                if(count == n){
                    return i;
                }
            }
        }

        return -1;
    }

}
