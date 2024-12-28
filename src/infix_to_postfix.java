

import java.util.Stack;

public class infix_to_postfix {


    public static int val(char c ){
        if(c=='+'|| c=='-'){
            return 1;
        } else if (c=='/' || c=='*') {
            return 2;
        }
        else if(c=='^') {
            return 3;
        }
        else {
            return -1;
        }
    }



    public static String infic ( String exp){
        String finalstr = new String("");
        Stack<Character>st=new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if(Character.isLetter(c)){
                finalstr+=c;
            }
            else{
                if(c=='('){
                    st.push(c);
                } else if (c==')') {
                    while(!st.empty() && st.peek()!='('){
                        finalstr+=st.pop();
                    }
                }else{
                    while(!st.empty() && val(c)<=val(st.peek())){
                        finalstr+=st.pop();
                    }
                    st.push(c);
                }

            }
        }

        while(!st.empty() ){
            if (st.peek() == '(')
                st.pop();
            else{
                finalstr+=st.pop();
            }
        }
        return finalstr;
    }





        // Driver method
        public static void main(String[] args) {
            String exp = "(p+q)*(m-n)";
            System.out.println(infic(exp));

        }
    



}
