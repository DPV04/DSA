import java.util.Stack;












public class prefixtopostfix {


    public static String posstfix(String exp) {
        Stack<String> st = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (Character.isLetter(ch)) {
                st.push(String.valueOf(ch));

            } else {
                String s1 = st.pop();
                String s2 = st.pop();

                String temp = s1 + s2 + ch;

                st.push(temp);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String exp = "*+AB-CD";


        System.out.print(posstfix(exp));

    }

}