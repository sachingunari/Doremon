import greenfoot.*; 
import java.awt.Font;
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class charelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class charSelection extends World
{

    /**
     * Constructor for objects of class charelection.
     * 
     */
    public charSelection()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(900, 550, 1); 
        SnowBackgroung snow=new SnowBackgroung();
       addObject (snow, getWidth()/2,getHeight()/2 );
       
       Playerselect players= new Playerselect();
        addObject (players, getWidth()/3+110, getHeight()/3-70);
        
        Doraemon doraemon= new Doraemon();
        addObject (doraemon, getWidth()/3, getHeight()/3 +50);
        
        Dorami dorami= new Dorami();
        addObject (dorami, getWidth()/3+200, getHeight()/3 + 50);
        
    }
    
}
