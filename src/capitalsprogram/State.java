/*
 *Part of capitalsProgram.java. See main class for further information.
 */
package capitalsprogram;

    //State class to be used as instantiated array of objects
public class State {

        //creates values to be used in program as unmaleable string data
    String name;
    String capital;
    String population;
    
        //constructor with each value
    public State(String n, String c, String p) {
        this.name = n;
        this.capital = c;
        this.population = p;
    }

        //base constructor
    State() {
        
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
    
    public boolean equals(State a) {
        if (this.name == a.name) {
            return true;
        }
        return false;
    }
    
    public int compareTo(State a) {
        int x;
        x = this.name.compareTo(a.name);
        return x;
    }
    
    public void copy(State a) {
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
