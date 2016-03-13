import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuClient extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    IMenuInvoker startButton=new MenuOptionInvoker();
    IMenuInvoker helpButton=new MenuOptionInvoker();
    IMenuCommand startcmd=new MenuCommand();
    IMenuCommand helpcmd=new MenuCommand();
    Start start=new Start();
    Help help=new Help();
    
    public MenuClient()
    {     
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        super(900, 550, 1); 
        
        
        
        MainScreen screen=new MainScreen();
        addObject (screen, getWidth()/2,getHeight()/2 );
        CharacterSubject character = new CharacterSubject(3,1);
        addObject (character, getWidth()/6, getHeight()/4);
        
        
        
        addObject (start, getWidth()/2, getHeight()/3+200);
        
        addObject (help, getWidth()/2, getHeight()/3+260); 
        
  
        
    }
    
    public void act()
    {
        
        startcmd.setReceiver(
                    new IMenuReceiver(){
                       public void doAction()
                      {
                           Greenfoot.setWorld(new charSelection());
                        }
        });
        
        helpcmd.setReceiver(
                    new IMenuReceiver(){
                       public void doAction()
                      {
                           Greenfoot.setWorld(new HelpWorld());
                        }
        });
        if(Greenfoot.mouseClicked(start))
        {
            startcmd.execute();
        }else
        if(Greenfoot.mouseClicked(help))
        {
            helpcmd.execute();
        }  
    }
} 
