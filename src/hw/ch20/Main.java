package hw.ch20;

public class Main {
    public static final String RED     = "\u001B[31m";
    public static final String GREEN   = "\u001B[32m";
    public static final String YELLOW  = "\u001B[33m";
    public static final String BLUE    = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN    = "\u001B[36m";
    public static final String RESET   = "\u001B[0m";
    public static void main(String[] args) {
        System.out.println("학번: 20220753, 이름: 김나영\n");
        
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);

        String[] colors = new String[args[0].length()];
        
        String[] colorPattern = {RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE};

        for (int i = 0; i < colors.length; i++) {
            colors[i] = colorPattern[i % colorPattern.length];
        }

        bs.print(colors);
    }
}
