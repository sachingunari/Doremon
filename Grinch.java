import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grinch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grinch extends Actor
{
moveStrategy1 moveStrategy1=new moveStrategy1();
    moveStrategy2 moveStrategy2=new moveStrategy2();
        moveStrategy3 moveStrategy3=new moveStrategy3();
            moveStrategy4 moveStrategy4=new moveStrategy4();
                moveStrategy5 moveStrategy5=new moveStrategy5();
                    moveStrategy6 moveStrategy6=new moveStrategy6();
    double SEAL_SPEED = -6;
    int flag=0;
    int score=0;
    /**
     * Act - do whatever the Grinch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Grinch(int score){
    GreenfootImage image=getImage();
    image.scale(image.getWidth()/2+10,image.getHeight()/2+10);
    setImage(image);
    this.score=score;
    }
    public void act() 
    {
        if(score <20){
moveStrategy1.move(getX(),getY(),this,getWorld());
        }
        else if (score >=20 && score <40){
        moveStrategy2.move(getX(),getY(),this,getWorld());
    }
    else if (score >=40 && score <60){
        moveStrategy3.move(getX(),getY(),this,getWorld());
    }
    else if (score >=60 && score <80){
        moveStrategy4.move(getX(),getY(),this,getWorld());
    }
    else if (score >=80 && score <100){
        moveStrategy5.move(getX(),getY(),this,getWorld());
    }
    else{
        moveStrategy6.move(getX(),getY(),this,getWorld());
    }
    }   

}
