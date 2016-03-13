import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Actor
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Help()
    {
    GreenfootImage image=getImage();
    image.scale(image.getWidth()/2,image.getHeight()/2);
    setImage(image);
    }
    public void act() 
    {
        
    }    
}
