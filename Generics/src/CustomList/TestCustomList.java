package CustomList;

import java.util.Scanner;

public class TestCustomList {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        GenericList<String> list = new GenericList<>();
        String line = sc.nextLine();
        System.out.println();
        while (!line.equals("end")) {
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Add":
                    list.add(tokens[1]);
                    break;
                case "Remove":
                    String removed = list.remove(Integer.parseInt(tokens[1]));
                    System.out.println(removed);
                    break;
                case "Contains":
                    boolean found = list.contains(tokens[1]);
                    System.out.println(found);
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Print":
                    list.print();
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Greater":
                    int greater = list.countGreaterThen(tokens[1]);
                    System.out.println(greater);
                    break;
                default:
                    throw new ClassNotFoundException("Unknown command! Try again :)");
            }

            line = sc.nextLine();
        }

        sc.close();

    }
}
