/*
See CapitalsProgram.java for full information
 */
package capitalsprogram;

/**
 *
 * @author 22csh
 */
public class StateList {    //external class for separate linked list
    
        //method to print list in its entirety
    public void printList(ListNode node) {
            //if node is null, there is no more to the list so stop
        if (node == null) {
            return;
        }
            //prints specific information from each node
        System.out.println(node.name + " : " + node.capital + " : " + node.population);
            //recursively 
        printList(node.next);
    }
    
        //method to create a new node
    private ListNode getNewNode(String name, String capital, String population) {
        ListNode a = new ListNode();
        a.name = name;
        a.capital = capital;
        a.population = population;
        a.next = null;
        return a;
    }
    
        //method to insert the new node onto the linked list
    public ListNode insert(String name, String capital, String population, ListNode node) {
            //if the node is empty it calls the method to create new node
        if (node == null) {
            return getNewNode(name, capital, population);
        } else {
            //otherwise it recursively adds another node
            node.next = insert(name, capital, population, node.next);
        }
        
        return node;
    }
}
