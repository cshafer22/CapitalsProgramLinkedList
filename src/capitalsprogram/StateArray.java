/*
 *Part of capitalsProgram.java. See main class for further information.
 */
package capitalsprogram;

/**
 *
 * @author 22csh
 */
public class StateArray {
    State[] statesList = new State[50]; //instatiates array of State objects
    
    
        //constructor
    public StateArray() {
        State[] states = new State[50];
    }
    
    @Override //StateArray as string
    public String toString() {
        String info;
        info = (statesList.toString());
        return info;
    }
}
