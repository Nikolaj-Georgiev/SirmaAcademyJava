import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inpArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] commandsArr = sc.nextLine().split(", ");
        int[] arr = new int[inpArr.length];
        System.arraycopy(inpArr, 0, arr, 0, inpArr.length);
        for (int i = 0; i < commandsArr.length; i++) {
            String[] currentCommandArr = commandsArr[i].split(" ");
            int[] newArr = new int[arr.length];
            switch (currentCommandArr[0]) {
                case "Add":
                    int[] newArrAdd = new int[arr.length + 1];
                    System.arraycopy(arr, 0, newArrAdd, 1, arr.length);
                    newArrAdd[0] = Integer.parseInt(currentCommandArr[1]);
                    newArr = newArrAdd;
                    break;
                case "Remove":
                    newArr = Arrays.stream(arr).filter(x -> x != Integer.parseInt(currentCommandArr[1])).toArray();
                    break;
                case "RemoveAt":
                    int[] newArrRemove = new int[arr.length - 1];
                    int counter = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if (j != Integer.parseInt(currentCommandArr[1])) {
                            newArrRemove[counter] = arr[j];
                            counter++;
                        }
                    }
                    newArr = newArrRemove;
                    break;
                case "Insert":
                    int[] newArrAddAtIndex = new int[arr.length + 1];
                    int index = Integer.parseInt(currentCommandArr[2]);
                    int indexCount = 0;
                    for (int k = 0; k < newArrAddAtIndex.length; k++) {
                        if (k == index) {
                            newArrAddAtIndex[k] = Integer.parseInt(currentCommandArr[1]);
                        } else {
                            newArrAddAtIndex[k] = arr[indexCount];
                            indexCount++;
                        }
                    }
                    newArr = newArrAddAtIndex;
                    break;
                default:
                    break;
            }
            arr = newArr;
        }
        for (int element : arr) {
            System.out.print(STR."\{element} ");
        }
    }
}
