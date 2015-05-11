package other;

public class VolatileTest2 {
	public static void main(String[] args) {
		System.out.println(tableSizeFor(2));
		
	}
	
    static final int tableSizeFor(int cap) {
        //int n = cap - 1;
    	int n = cap;
        n ^= n >>> 1;
        
       // n |= n >>> 2;
        
       // n |= n >>> 4;
       // n |= n >>> 8;
       // n |= n >>> 16;
        return n;
    }
}
