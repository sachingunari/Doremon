import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TotalGifts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TotalGifts extends Actor
{
    /**
     * Act - do whatever the TotalGifts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public TotalGifts(){
         GreenfootImage image=getImage();
    image.scale(image.getWidth()/3,image.getHeight()/3);
     setImage(image);
    }
    
}
