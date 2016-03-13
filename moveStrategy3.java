import greenfoot.*;

/**
 * Write a description of class moveStrategy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moveStrategy3 extends Actor implements IStrategy 
{
    double SEAL_SPEED = -11;
    int flag=0;
  
    // instance variables - replace the example below with your own
    public void move( int x, int y, Actor actor,World world)
    {
        if(flag/10==0){
            actor.setLocation((int) (x + SEAL_SPEED), y+flag );
        }
        else if(flag/10==1){
           
            actor.setLocation((int) (x + SEAL_SPEED), y-flag+10 );
        }
        if(flag==20){
        flag=0;
        }
        flag++;
   
    
        
        if (x <= -10) {
            world.removeObject(actor);
        }
    }
}