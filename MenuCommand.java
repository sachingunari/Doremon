/**
 * Write a description of class MenuCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuCommand implements IMenuCommand
{
    // instance variables - replace the example below with your own
    private IMenuReceiver target;

    /**
     * Constructor for objects of class MenuCommand
     */
    @Override
    public void execute()
    {
        target.doAction();
    }
    
    public void setReceiver(IMenuReceiver t)
    {
        target = t;
    }
}
