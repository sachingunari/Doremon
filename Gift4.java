import greenfoot.*;

/**
 * Write a description of class Gift4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gift4 extends Actor implements IGift
{
    /**
     * Act - do whatever the Gift4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double COIN_SPEED = -6;
    public void act() 
    {
        // Add your action code here.
        move();
    }    
    public void createGift(){
    this.setImage("gift9.png");
    GreenfootImage image=getImage();
    
    image.scale(image.getWidth()/3,image.getHeight()/3);
    setImage(image);

}
public void move() {
        
        setLocation ( (int) (getX() + COIN_SPEED), getY() );
        
        if (getX() <= -10) {
            getWorld().removeObject(this);
        }
}
}
