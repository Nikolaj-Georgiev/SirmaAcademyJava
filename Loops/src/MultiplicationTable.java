public class MultiplicationTable {
    public static void main(String[] args) {

        String result = "";
        for (int i = 1;i <= 10;i++) {
            for (int j = 1;j <= 10;j++) {
                result = i + " * " + j + " = " + (i*j);
                System.out.println(result);
            }
        }

    }
}

//"{first multiplier} * {second multiplier} = {result}".