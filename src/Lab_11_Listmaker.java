import java.util.ArrayList;
import java.util.Scanner;
public class Lab_11_Listmaker {
    static void main() {

        ArrayList<String> myArrList = new ArrayList<>();
        Scanner pipe = new Scanner(System.in);

     while(true) {
         IO.print(" A – Add an item to the list\n D – Delete an item from the list\n I – Insert an item into the list\n P – Print the list\n Q – Quit the program\n");
         String action = SafeInput.getRegExString(pipe, "What would you like to do with the list?", "[AaDdIiQqPp]");

         switch (action) {

             case "A", "a":
                 add(pipe, myArrList);
                 pipe.nextLine();
                 break;
             case "D", "d":
                 delete(pipe,myArrList);
                 pipe.nextLine();
                 break;
             case "I", "i":
                 insertItem(pipe,myArrList);
                 pipe.nextLine();
                 break;
             case "P", "p":
                 printList(pipe,myArrList);
                 break;
             case "Q", "q":
                 quit(pipe,myArrList);
                 break;
         }



     }

    }
    public static void add(Scanner pipe,ArrayList<String> myArrList) {
        System.out.print("What would you like to add to the list?: ");
        myArrList.add(pipe.next());
    }

    public static void delete(Scanner pipe,ArrayList<String> myArrList) {
        for (int i = 0; i < myArrList.size(); i++) {
            System.out.println(i + " " + myArrList.get(i));
        }
        IO.print("What would you like to delete from the list?: ");
        int response = pipe.nextInt();
        myArrList.remove(response);
    }

    public static void insertItem(Scanner pipe,ArrayList<String> myArrList) {
        for (int i = 0; i < myArrList.size(); i++) {
            System.out.println(i + " " + myArrList.get(i));
        }
        IO.print("Where would you like to add to the list?: ");
        int response = pipe.nextInt();
        IO.print("What would you like to add?: ");
        String wordResponse = pipe.next();
        myArrList.add(response, wordResponse);
    }

    public static void printList(Scanner pipe,ArrayList<String> myArrList) {
        for (int i = 0; i < myArrList.size(); i++) {
            System.out.println(i + " " + myArrList.get(i));
        }
        System.out.println();
    }

    public static void quit(Scanner pipe,ArrayList<String> myArrList) {
        boolean verification = SafeInput.getYNConfirm(pipe, "Are you sure you want to quit?");
        if (verification) {
            System.exit(0);
        } else if (!verification) {
            return;
        }
    }
}
