import greenfoot.*;

/**
 * Write a description of class Playerselect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playerselect extends Actor
{
    /**
     * Act - do whatever the Playerselect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Playerselect()
    {
    GreenfootImage image=getImage();
    image.scale(image.getWidth()/2 + 10,image.getHeight()/2 + 10);
    setImage(image);
}
    public void act() 
    {
        // Add your action code here.
    }    
}
