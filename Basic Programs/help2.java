/*
An improved help system that uses a do-while to process a menu selection
*/

class help2
{
    private static final char CHAR = '1';

    public static void main(String args[]) throws java.io.IOException {
        char choice;
        do {
            System.out.println("Help on:");
            System.out.println("");
            System.out.println("1.if");
            System.out.println("2.switch");
            System.out.println("3.for");
            System.out.println("4.while");
            System.out.println("5.do-while");
            System.out.println("Choose one:");
            do {
                choice = (char) System.in.read();
            } while (choice == '\n' | choice > '5');
        } while (choice <'1' | choice > '5');
            System.out.println("\n");
            switch(choice)
            {
                case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                break;
                case '2':
                System.out.println("The switch:");
                System.out.println("switch(expression) {");
                System.out.println("case constant:");
                System.out.println("statement sequence");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
                case '3':
                System.out.println("The for:\n");
                System.out.print("for(init;condition;iteration)");
                System.out.println("statement;");
                break;
                case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition){statements;}");
                break;
                case '5':
                System.out.println("The do-while\n");
                System.out.println("do{");
                System.out.println(" statement;");
                System.out.println("} while(condition);");
                break;
            }
        }
    }
