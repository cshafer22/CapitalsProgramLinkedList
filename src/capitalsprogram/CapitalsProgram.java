/*
Program to load a data file into created linked list, print that list,
and then allow for user input to find information within each node on
that linked list.
 */
package capitalsprogram;
import java.util.*; //import utilities
import java.io.*; //import input/output

/**
 *
 * @author 22csh
 */
public class CapitalsProgram { //main class for 

        //main method
    public static void main(String[] args) throws Exception{
        File infile; //instantiates new file to accept a file input
            //saves file as result of external method
        infile = getFile();
            //instantiates scanner with returned infile 
        Scanner doc = new Scanner(infile);
            //instantiates starting node
        ListNode root = null;
            //instatiates new list
        StateList states = new StateList();
            //populates node as a result of external method that uses the node, the scanner, and the list
        root = listFilter(states, root, doc);
            //prints list with method in external class
        System.out.println("The list of states, their capitals, and their populations are as follows:");
        states.printList(root);
            //external method to allow for user input to search array
        listSearch(root);
    }
    
        //external method to get a file with try catch exception
    public static File getFile () throws FileNotFoundException {        
        File infile = new File("statedata.txt"); //instantiates infile from folder
        Scanner user = new Scanner(System.in); //instantiates scanner for user input
        String errorHandler; //place holder string to handle errors
            //try-catch block to catch potential input error
        try {
            Scanner doc = new Scanner(infile); //instantiates scanner as inputed file from folder
        } catch (FileNotFoundException a) {
            System.out.println("Something went wrong. Please enter the program's correct infile \"statedata.txt\":");
            errorHandler = user.nextLine(); //accpets user input and saves it to handle error
            infile = new File(errorHandler); //attaches the error handler to the instantiated infile
            System.out.println("");
        }
            //returns the infile
        return infile;
    }
    
        //external method to populate list
    public static ListNode listFilter(StateList states, ListNode root, Scanner doc) {
            //while loop that populates list from concatonated iterative values on the document
        while (doc.hasNextLine()) {
            //saves the root node as part of a list of nodes with the values given by the document
            root = states.insert(doc.nextLine(), doc.nextLine(), doc.nextLine(), root);
        }
            //returns initial node and thus entire linked list
        return root;
    }
    
        //external method to accept user input to find information about a state
    public static void listSearch(ListNode origin) {
        Scanner user = new Scanner(System.in); //instantiates scanner to get user input
        System.out.println("\nWhat state would you like to look up?");
        String userState = user.nextLine(); //saves input value as string
        listSort(userState, origin, origin); //sends two copies of list and the user input to another method
    }
    
        //external method to test and search for the user input using a root node and its copy
    public static void listSort(String userState, ListNode node, ListNode origin) {
            //if the node is not null, meaning its before the end of the linked list...
        if (node != null) {
                //if the name of the state in that node does not meet the user input
            if (!userState.equals(node.name)) {
                //recursively search the list using the next node and a copy of the original
                listSort(userState, node.next, origin);
                //until it does equal the user input
            } else if (userState.equals(node.name)) {
                //then print the information attached to that node
                System.out.println(node.name + " : " + node.capital + " : " + node.population);
            }
            //else if user input was not found
        } else {
            System.out.println("I'm sorry. Your state was not found. Please try again.");
                //get the user input again and start over using the copied original root node
            listSearch(origin);
        }
    }
}
