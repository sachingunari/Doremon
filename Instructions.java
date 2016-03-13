import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")) {
            World world;
            world = getWorld();
            world.removeObject(this);
        }
    }   
    public Instructions() {
         GreenfootImage newImage = new GreenfootImage (550, 200);
        
        setImage(newImage);
        
        
        Color c = new Color (127, 127, 127, 127);
        newImage.setColor(c);
        newImage.fill();
        
        Font f = new Font("OCR A Extended", Font.BOLD,30);
        newImage.setFont(f);
        newImage.setColor(Color.GREEN);
        newImage.drawString("How to play!", 160, 20);
        Font f1 = new Font("OCR A Extended", Font.BOLD,20);
        newImage.setFont(f1);
        newImage.setColor(Color.WHITE);
        newImage.drawString("-->Press 'Up' to move higher", 25, 55);
        newImage.drawString("-->Collect as many dora cakes as ", 25, 95);
        newImage.drawString("   possible to advance to the next level", 25, 120);
        newImage.drawString("-->Avoid colliding into enemies", 25, 155);
        setImage(newImage);
    }
}
