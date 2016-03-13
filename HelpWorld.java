import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class HelpWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpWorld extends World
{

    /**
     * Constructor for objects of class HelpWorld.
     * 
     */
    public HelpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 768, 1); 
        SnowBackgroung snow=new SnowBackgroung();
       addObject (snow, getWidth()/2,getHeight()/2 );
        Instructions inst=new Instructions();
        addObject (inst, getWidth()/2, getHeight()/2);
        Back back=new Back();
        addObject (back, 80, getHeight()-50);
        
       
    }
}
