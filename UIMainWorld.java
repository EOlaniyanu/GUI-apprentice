import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class UIMainWorld here.
 * 
 * Name: Emmanuel Olaniyanu
 * Teacher: Mr. Hardman
 * Lab #6, GUI-Graphic User Interface
 * Date Last Modified: 05/24/2017
 * 
 */
public class UIMainWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        testActors();
    }
    
    /**
     * testActors adds the User interfaces into the world.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void testActors()
    {
        addObject(new Button( 10 , "button-blue.png" , "button-green.png" , "sup"), getWidth()/2,  ( 3 * getHeight()/4 ) );
        addObject(new Label( 10, 24), getWidth()/2, getHeight()/4 );
        addObject( new TextBox("Click a Button", 24, true, Color.BLACK, Color.WHITE ), getWidth()/2, getHeight()/2 );
        addObject( new Menu("File", "New\nOpen\nSave\nClose\nExit", 24, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, new FileCommands()), getWidth()-50, getHeight()-200);
    }
}
