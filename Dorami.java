import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dorami here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dorami extends Actor
{
    /**
     * Act - do whatever the dorami wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Dorami()
    {
    GreenfootImage image=getImage();
    image.scale(image.getWidth()/2 + 10,image.getHeight()/2 + 10);
    setImage(image);
}
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.setWorld(new DoremonWorld(2));
        }
    }    
}
