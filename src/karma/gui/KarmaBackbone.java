package karmap.gui;

import javax.swing.JButton;
import karmap.lib.KarnaughMap;
import karmap.lib.MinTerm;

public class AppBackBone {
    private static final int MAX_STRING_LEN = 28;
    
    public static Object tern(boolean expr, Object ob1, Object ob2) {
        if (expr) {
            return ob1;
        } else {
            return ob2;
        }
    }
    
    public static void toggle(JButton a, JButton b) {
        final String result = tern(a.getText().equals("0"), "1", "0").toString();
        a.setText(result);
        b.setText(result);
    }
    
    public static String solveByMapBackBone(JButton[] list) {
        MinTerm[] terms = new MinTerm[list.length];
        
        for (int i = 0; i < list.length; i++) {
            terms[i] = new MinTerm(list[i].getText().equals("1"), i);
        }
        
        return new KarnaughMap(4, terms).solve();
    }
    
    public static String solveByInputBackBone(String input) {
        final String[] in = input.split("\\s+");
        MinTerm[] terms = new MinTerm[in.length];
        
        for (int i = 0; i < in.length; i++) {
            terms[i] = new MinTerm(true, Integer.parseInt(in[i]));
        }
        
        return new KarnaughMap(4, terms).solve();
    }
}
