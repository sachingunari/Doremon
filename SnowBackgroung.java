import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnowBackgroung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowBackgroung extends Actor
{
    /**
     * Act - do whatever the SnowBackgroung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    
     */
     GifImage gifImage = new GifImage("animatedsnow.gif");
      
    public void act() 
    {
         // gifImage.scale(1000,80);
       setImage(gifImage.getCurrentImage());
       
    }   
 
  
}
