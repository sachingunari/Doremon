/**
 * Write a description of class MenuOptionIvoker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuOptionInvoker implements IMenuInvoker
{
    // instance variables - replace the example below with your own
    private IMenuCommand cmd;

    
    public void setCommand(IMenuCommand c)
    {
        cmd=c;
    }
    
       public void invoke()
    {
       cmd.execute();
    }
}
