import java.util.Stack;

public class balancedParanthethis {
    private static boolean print(String str){
       Stack<Character> st=new Stack<>();
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='(' || ch=='{'||ch=='['){
            st.push(ch);
           }else 
           {if(st.empty()){
            return false;
           }
           char top=st.pop();
           if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')){
                        return false;
                    }
        }
       }
       return st.isEmpty();
      
        
    }
    public static void main(String[] args) {
        String str="{{{[}}}";
       System.out.println(print(str)); 
    }
}
