/**
 * Write a description of class command here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IMenuCommand  
{
    
    //
    public void execute();
    public void setReceiver(IMenuReceiver target);
}
