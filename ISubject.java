/**
 * Write a description of class ISubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ISubject  
{
    public void attach(IObserver obj);
    //public void detach(Iobserver obj);
    public void notifyObserver();
}
