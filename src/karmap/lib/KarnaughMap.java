package karmap.lib;

import java.io.IOException;

public class KarnaughMap {
    private static final int[][][] POSITIONS = {
        {
            // empty
        },
        {
            // 1 var
        },
        {
            // 2 vars
        },
        {
            // 3 vars
        },
        {
            {0, 0}, {1, 0}, {3, 0}, {2, 0}, {0, 1}, {1, 1}, {3, 1}, {2, 1},
            {0, 3}, {1, 3}, {3, 3}, {2, 3}, {0, 2}, {1, 2}, {3, 2}, {2, 2},
        },
    };

    private int[][] kmap = null;
    private String binaryTable = "";
    private int minTermsAmount = 0;
    
    public KarnaughMap(final int variables, final MinTerm[] list) {
        minTermsAmount = 0;
        kmap = new int[variables][variables];
        final StringBuilder sb = new StringBuilder();
        
        for (MinTerm entry: list) {
            final int[] pos = POSITIONS[variables][entry.getIndex()];
            
            if (entry.getValue()) {
                sb.append(entry.getBinaryValue()).append('\n');
                kmap[ pos[0] ][ pos[1] ] = 1;
                minTermsAmount++;
            }
            
            kmap[ pos[0] ][ pos[1] ] = 0;
        }
        
        binaryTable = sb.toString();
    }
    
    public String solve() {
        try {
            if (binaryTable.equals("")) {
                return "0";
            } else if (minTermsAmount == 16) {
                return "1";
            }
            
            Formula f = Formula.read(binaryTable);
            f.simplify();
            
            return f.toString();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        
        return "";
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (int[] kmap1 : kmap) {
            for (int v: kmap1) {
                sb.append(v);
            }
            
            sb.append('\n');
        }
        
        return sb.toString();
    }
}