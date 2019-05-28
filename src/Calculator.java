import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");
        Scanner in = new Scanner(System.in);
        String string = in.next();
        try {
            Double d = (Double) se.eval(string);
            System.out.println(d);
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            try {
                Integer d = (Integer) se.eval(string);
                System.out.println(d);
            } catch (ScriptException e1) {
                e1.printStackTrace();
            }
        }
    }
}
