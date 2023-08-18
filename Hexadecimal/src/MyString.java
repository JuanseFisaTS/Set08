public class MyString {

    public String str;

    public MyString(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        if (ch>='a' && ch <= 'f'){
            return true;
        }
        else if (ch>='A' && ch <='F') {
            return true;
        }
        
        return false;
    }

    public boolean isHexadecimal() {
        if (str == null || str.length() == 0) {
            return false;
        }
         char[] arr = str.toCharArray();
         
         for (char ch : arr) {
           
            if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
                return false;
            }
        }
        
     return true;
    }
    
    
}