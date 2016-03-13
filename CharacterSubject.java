import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class  here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterSubject extends Actor implements ISubject{
    double dy = -7.2;
    double g = 0.5;
    double BOOST_SPEED = -4;
    boolean isPaused = true;
    int score = +5;
    int count = 0;
    ScoreObserver scoreCount = null;
    IObserver scoreObserver=null;
        
    //GreenfootSound music;
    
    GreenfootSound aww;
    GreenfootSound punch ;
    GreenfootSound eat;
    
    public CharacterSubject(int x,int selection)
     
   {
     
         aww = new GreenfootSound("Aww.mp3");
        punch= new GreenfootSound("Punch.mp3");
        eat=  new GreenfootSound("eat.mp3");
  if(selection==1){
      this.setImage("char_doraemon.png");
      GreenfootImage image=getImage();
    image.scale(image.getWidth()/x,image.getHeight()/x);
     setImage(image);
    }
    else{
        this.setImage("char_dorami.png");
        GreenfootImage image=getImage();
    image.scale(image.getWidth()/x + 20,image.getHeight()/x+20);
     setImage(image);
    }
    
   
    } 
 
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
 
        //playMusic();
        getGift();
        move();
        die();
        getEaten(); 
        pause();

    }    

    public void move() {
        setLocation (getX(), (int) (getY() + dy));
        dy = dy + g;
        if (Greenfoot.isKeyDown("up") == true) { 
            dy = BOOST_SPEED;
        } 
        if (dy > 5) {
            setRotation(30);
        } else if (dy < 0){
            setRotation(-30);
        } else {
            setRotation(0);
        }
    }

    public void die(){
       
        if (getOneIntersectingObject(Ground.class) != null) {
            gameOver();
        }
        if (getY() >= getWorld().getHeight() ) {
            gameOver(); 
        }
        
        
    }
    
    private void gameOver() {
        //punch.play();
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        //music.stop();
        //aww.play();
        soundClient s=new soundClient();
        s.handleSound("die");
        Greenfoot.stop();
    }

  

    public void playMusic() {
       // music.play();
        

    }

    public void pause() {
        if (Greenfoot.isKeyDown("p")) {
           // music.stop();
            Greenfoot.stop();
        }
    }

    public void getGift() {
        Actor gift1;
        Actor gift2;
        Actor gift3;
        Actor gift4;
        Actor gift5;
        
       // gift = getOneObjectAtOffset(0, 0, Gift.class);
        gift1 = getOneObjectAtOffset(0, 0, Gift1.class);
        gift2 = getOneObjectAtOffset(0, 0, Gift2.class);
        gift3 = getOneObjectAtOffset(0, 0, Gift3.class);
        gift4 = getOneObjectAtOffset(0, 0, Gift4.class);
        gift5 = getOneObjectAtOffset(0, 0, Gift5.class);
        
        if (gift1 != null || gift2 != null || gift3 != null || gift4 != null || gift5 != null) {
            World world;
            world = getWorld();
            world.removeObject(gift1);
            world.removeObject(gift2);
            world.removeObject(gift3);
            world.removeObject(gift4);
            world.removeObject(gift5);
            //eat.play();
            soundClient s=new soundClient();
        s.handleSound("eat");
            //DoremonWorld doremonWorld = (DoremonWorld) world;
            //ScoreObserver scoreCount = doremonWorld.getGiftCount();
            count++; 
            notifyObserver();     
        }
    }

    public void getEaten() {
        Actor grinch;
        grinch = getOneObjectAtOffset(0, 0, Grinch.class);
        if (grinch != null) {
            
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            getWorld().removeObject(this);
            //music.stop();
            //Greenfoot.playSound("yum.wav");
            //aww.play();
            soundClient s=new soundClient();
        s.handleSound("eaten");
            Greenfoot.stop();
        }
    }
    public void attach(IObserver obj){
        scoreObserver=obj;
    }
    //public void detach(){}
    public void notifyObserver(){
    
    scoreObserver.update(count);
    }
}
