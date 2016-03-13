import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoremonWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoremonWorld extends World
{

    int doremonCounter = 0;
    int score = 0;
    
    CharacterSubject character = null;
    DoremonTitle doremonTitle = null;
    PlayButton play = null;
    boolean isPaused = true;
    GreenfootSound honk = new GreenfootSound("Honk.mp3");
    GreenfootSound backgroundMusic = new GreenfootSound("score.mp3");
   ScoreObserver scoreCount=new ScoreObserver();  
     
    
    /**
     * Constructor for objects of class DoremonWorld.
     * 
     */
    public DoremonWorld(int x)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 550, 1, false); 
      
       backgroundMusic.playLoop();
       SnowBackgroung snow=new SnowBackgroung();
       addObject (snow, getWidth()/2,getHeight()/2 );
       
       
        character= new CharacterSubject(3,x);
        addObject (character, getWidth()/6, getHeight()/2);
       
        
      
        addObject(scoreCount, getWidth()/2+50, getHeight()/6+-10);
        TotalGifts totalGifts = new TotalGifts();
        
        addObject(totalGifts, getWidth()/2, getHeight()/6-20);

        
        DoremonTitle doremonTitle = new DoremonTitle();
        addObject (doremonTitle, getWidth()/2, getHeight()*1/3);
        

        
        setPaintOrder(GameOver.class, Character.class, DoremonTitle.class, ScoreObserver.class, Instructions.class, Grinch.class, Gift. class, Ground.class);
    character.attach(scoreCount);
    }
    public void started()
{
    backgroundMusic.playLoop();
}
 public void stopped()
{
     backgroundMusic.pause();
}    
  
 
    public void act() {
        
       
       
        if (Greenfoot.isKeyDown("space")) {
            honk.play();
        }
         
          if (Greenfoot.getRandomNumber(1000) >= 995) {
            Grinch grinch = new Grinch(character.count);
            addObject(grinch, getWidth(), (int) (Greenfoot.getRandomNumber(getHeight()/2)+150));
        }
    
         if (Greenfoot.getRandomNumber(1000) >= 980) {
            Gift gift = new Gift();
           switch (gift.giftID){
           case 1: addObject(gift.gift1, getWidth(), (int) (Greenfoot.getRandomNumber(getHeight()/2)+150));
           break;
           case 2:addObject(gift.gift2, getWidth(), (int) (Greenfoot.getRandomNumber(getHeight()/2)+150));
           break;
           case 3:addObject(gift.gift3, getWidth(), (int) (Greenfoot.getRandomNumber(getHeight()/2)+150));
           break;
           case 4: addObject(gift.gift4, getWidth(), (int) (Greenfoot.getRandomNumber(getHeight()/2)+150)); 
           break;
           case 0:addObject(gift.gift5, getWidth(), (int) (Greenfoot.getRandomNumber(getHeight()/2)+150));
           break;
        }
    
    }

}
}
 