import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoremonTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoremonTitle extends Actor
{
    /**
     * Act - do whatever the DoremonTitle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("up")) {
            World world;
            world = getWorld();
            world.removeObject(this);
            
        }
    }    
}
