import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class GiftCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreObserver extends Actor implements IObserver
{
    /**
     * Act - do whatever the GiftCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      
    public ScoreObserver() {
        GreenfootImage newImage = new GreenfootImage (150, 70);
       
        setImage(newImage);
    }
    @Override
    public void update(int count) {
        GreenfootImage newImage = getImage();
        
        newImage.clear();
        
        Font f = new Font("Comic Sans MS", Font.BOLD, 24);
        newImage.setFont(f);
        
        Color c = new Color(127,127,127,127);      
        newImage.setColor(c);
        //newImage.fill();
        newImage.setColor(Color.RED);
        
        newImage.drawString(" X "+count, 60, 35);
       
        setImage(newImage);
        
        
    }
}
