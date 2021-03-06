/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezdoc;
import java.util.ArrayList;

/**
 * Provides basic specifications on how to execute 
 * script.
 * @author Antony
 */
public interface Instruction{
    
    /**
     *  Method:         addProcedure
     *  Description:    Adds a new procedure for this instruction
     *  Parameter:      Procedure _Procedure[in] code of execution 
     *  Return:         n/a
     */
    public void addProcedure(Procedure _Procedure);
    
    /**
     *  Method:        input 
     *  Description:   Accepts and validates input
     *  Parameter:     Object _Item[in] input
     *  Return:        boolean, true if input is valid else false.
     */
    public Boolean input(Object _Item);

    /**
     *  Method:         execute
     *  Description:    Process input based on defined procedures.
     *  Parameter:      n/a
     *  Return:         Object, result of work done.
     */
    public Object execute();
    
    /**
     *  Method:         clearInput
     *  Description:    Clears all input contained in this Instruction object
     *  Parameter:      n/a
     *  Return:         n/a
     */
    public void clearInput();
    
    /**
     *  Method:         requestInputType
     *  Description:    Returns required input for successful execution.
     *  Parameter:      n/a
     *  Return:         ArrayList<String>, list of required input.
     */
    public ArrayList<String> requestInputType();
    
    /**
     *  Method:         inputRequested  
     *  Description:    Determines if instruction needs more input to execute
     *  Parameter:      n/a
     *  Return:         Boolean, true if instruction needs more input else false
     */
    public Boolean inputRequested();    
}
