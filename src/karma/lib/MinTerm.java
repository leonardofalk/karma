package karmap.lib;

public class MinTerm {
    private static final int[][] EQUATIONS_4x4 = {
        {0, 0, 0, 0}, {0, 0, 0, 1},
        {0, 0, 1, 0}, {0, 0, 1, 1},
        {0, 1, 0, 0}, {0, 1, 0, 1},
        {0, 1, 1, 0}, {0, 1, 1, 1},
        {1, 0, 0, 0}, {1, 0, 0, 1},
        {1, 0, 1, 0}, {1, 0, 1, 1},
        {1, 1, 0, 0}, {1, 1, 0, 1},
        {1, 1, 1, 0}, {1, 1, 1, 1},
    };
    
    private static final String[] EQUATIONS_s4x4 = {
        "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111",
    };
    
    private boolean value;
    private int index;
    private int[] truthValues = null;
    
    public MinTerm(final boolean value, final int index) {
        this.value = value;
        this.index = index;
        this.truthValues = EQUATIONS_4x4[index];
    }
    
    public boolean getValue() {
        return value;
    }
    
    public void setValue(final boolean value) {
        this.value = value;
    }
    
    public int getIndex() {
        return index;
    }
    
    public void setIndex(final int index) {
        this.index = index;
    }
    
    public String getBinaryValue() {
        return EQUATIONS_s4x4[index];
    }
}
