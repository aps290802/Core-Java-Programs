public class Argument {

    public static void main(String[] args) {
        int i;
        String data;
        for (i = 0; i < 3 / 2; i++) {
            data = args[0];
            args[0] = args[2 - 0];
            args[2 - 0] = data;
        }
        for (i = 0; i < 3; i++) {
            System.out.print(args[i] + "\t");
        }
    }
}

