import greenfoot.*;
/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FileCommands
     */
    public FileCommands()
    {
    }
    
    /**
     * execute prints the menu commands in the system.
     * 
     * @param idx represents whih menu option was clicked
     * @param w is the variable that represents UIMainWorld
     * @return Nothing is returned.
     */
    public void execute(int idx, World w)
    {
        if ( idx == 0 )
        {
            System.out.println("Running New Command");
            
        }
        else if ( idx == 1 )
        {
            System.out.println("Running Open Command");
        }
        else if ( idx == 2 )
        {
            System.out.println("Running Save Command");
        }
        else if ( idx == 3 )
        {
            System.out.println("Running Close Command");
        }
        else if ( idx == 4 )
        {
            System.out.println("Running Exit Command");
        }
    }
}
