import java.util.Stack;

public class infixtopostfix {
    private static String print(String str){
        int i=0;
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        while(i<str.length()){
            if(Character.isLetterOrDigit(str.charAt(i))){
                ans.append(str.charAt(i));
            }else if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                while(!st.empty()&&st.peek()!='('){
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop();
            }else{
                while(!st.empty()&&priority(str.charAt(i))<=priority(st.peek())){
                    ans.append(st.peek());
                    st.pop();
                }
                st.push(str.charAt(i));
            }
            i++;
        }
        while(!st.empty()){
            ans.append(st.peek());
            st.pop();
        }
        return ans.toString();
    }
    private static int priority(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1; 
        }
    }
    public static void main(String[] args) {
        String str="a+b-c*d";
        System.out.println(print(str));
    }
}
