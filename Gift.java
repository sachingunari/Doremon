import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gift here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gift extends Actor
{
    double COIN_SPEED = -6;
    int giftID=0;
   // String gifts[]={"gift1.png","gift2.png","gift3.png","gift4.png","gift5.png","gift6.png","gift7.png","gift8.png","gift9.png","gift10.png"};
    
    /**
     * Act - do whatever the Gift wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
    }   
       Gift1 gift1;
       Gift2 gift2;
       Gift3 gift3;
       Gift4 gift4;
       Gift5 gift5;
    public Gift(){
       giftID=Greenfoot.getRandomNumber(5);
    
        gift1=new Gift1();
        gift2=new Gift2();
        gift3=new Gift3();
        gift4=new Gift4();
        gift5=new Gift5();
      
        
     if (giftID==1){
       
            gift1.createGift();
            
       }
        else if (giftID==2){
         gift2.createGift();
          
       }
       else if (giftID==3){
        gift3.createGift();
          
       }
       else if (giftID==4){
        gift4.createGift();
          
       }else if (giftID==0){
         gift5.createGift();
          
       }
        
    }

}
