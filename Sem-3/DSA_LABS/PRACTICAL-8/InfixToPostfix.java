import java.util.Scanner;

public class InfixToPostfix {
    static int TOP = -1;
    static String infix = "(a+b^c^d)*(e+f/d)";
    static int next = 0;
    static char[] s = new char[infix.length()];

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        revpol();
        inp.close();
    }

    static void revpol() {
        StringBuilder polish = new StringBuilder();
        char nextChar;

        push('(');

        while (next < infix.length()) {
            nextChar = nextChar();

            if (nextChar == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(nextChar)) {
                polish.append(nextChar);
            } else if (nextChar == '(') {
                push(nextChar);
            } else if (nextChar == ')') {
                while (s[TOP] != '(') {
                    char temp = pop();
                    polish.append(temp);
                }
                pop();
            } else {
                while (TOP >= 0 && g(s[TOP]) >= f(nextChar)) {
                    char temp = pop();
                    polish.append(temp);
                }
                push(nextChar);
            }
        }

        while (TOP >= 0) {
            char temp = pop();
            if (temp != '(') {
                polish.append(temp);
            }
        }

        System.out.println("Postfix: " + polish.toString());
    }

    static char nextChar() {
        return infix.charAt(next++);
    }

    static void push(char item) {
        if (TOP < s.length - 1) {
            s[++TOP] = item;
        }
    }

    static char pop() {
        if (TOP >= 0) {
            return s[TOP--];
        }
        return 0;
    }

    static int g(char op) {
        if(Character.isLetter(op)){
            return 8;
        }
        switch (op) {
            case '+':
                return 2;
            case '-':
                return 2;
            case '*':
                return 4;
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
                return 0;
            default:
                return -1;
        }
    }

    static int f(char op) {
        if(Character.isLetter(op)){
            return 7;
        }
        switch (op) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 3;
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 9;
            case ')':
                return 0;
            default:
                return -1;
        }
    }

    static int r(char op) {
        if(Character.isLetter(op)){
            return -1;
        }
        switch (op) {
            case '+':
                return -1;
            case '-':
                return -1;
            case '*':
                return -1;
            case '/':
                return -1;
            case '^':
                return -1;
            default:
                return -1;
        }
    }
}
