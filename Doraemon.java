import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class doraemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doraemon extends Actor
{
    /**
     * Act - do whatever the doraemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.setWorld(new DoremonWorld(1));
        }
    }    
    public Doraemon()
    {
    GreenfootImage image=getImage();
    image.scale(image.getWidth()/2,image.getHeight()/2);
    setImage(image);
}
}
