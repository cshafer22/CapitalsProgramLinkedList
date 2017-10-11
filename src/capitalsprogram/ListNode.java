/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalsprogram;

/**
 *
 * @author 22csh
 */
public class ListNode { //external class for each node on the linked list
    String name; //instantiates name value
    String capital; //instantiates capital value
    String population; //instantiates population value
    ListNode next; //points cursor at next node
    
        //constructor with each value
    public ListNode(String n, String c, String p) {
        this.name = n;
        this.capital = c;
        this.population = p;
    }

        //base constructor
    ListNode() {
        
    }
    
        //list of setters and getters for each value in the object
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
    
     public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
    
        //equals method
    public boolean equals(ListNode a) {
        if (this.name == a.name) {
            return true;
        }
        return false;
    }
        //compareTo method
    public int compareTo(ListNode a) {
        int x;
        x = this.name.compareTo(a.name);
        return x;
    }
        //deep copy method
    public void copy(ListNode a) {
        a.name = this.name;
        a.capital = this.capital;
        a.population = this.population;
    }
    
    @Override //overrides string valuation of class, creating a seperate info print
    public String toString() {
        String info;
        info = (name + " : " + capital + " : " + population);
        return info;
    }
}
