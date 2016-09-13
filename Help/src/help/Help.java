/* Program Name: Help.java
 * Written By:   Sarah Park
 * Date:         2016 September 12
 */
package help;

/**
 *
 * @author sarahpark
 */
public class Help {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        
        do {
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while\n");
        System.out.print("Choose one: ");
        
        choice = (char) System.in.read();
        
        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');
        
        switch(choice) {
            case '1':
                System.out.println("The if:\n\n if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant:");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.print("Selection not found.");
                
          
        }
    }
      
    
}
