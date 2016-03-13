import greenfoot.*;

/**
 * Write a description of class moveStrategy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moveStrategy1 extends Actor implements IStrategy 
{
    double SEAL_SPEED = -6;
    int flag=0;

   
    // instance variables - replace the example below with your own
    public void move( int x, int y, Actor actor,World world)
    {
        if(flag==20){
        flag=0;
        }
        flag++;
   
         actor.setLocation((int) (x + SEAL_SPEED), y );
     
        if (x <= -10) {
            world.removeObject(actor);
        }
    }
}
