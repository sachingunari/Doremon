import greenfoot.*;

public class concreteHandler1 implements soundHandler{

private soundHandler successor=null;
GreenfootSound sound=new GreenfootSound("Punch.mp3");
GreenfootSound sounds=new GreenfootSound("Aww.mp3");


public void handleRequest(String request){

if(request.equals("die"))
{
sound.play();
sounds.play();
}
else{
if(successor != null)
{
successor.handleRequest(request);
}
}
}

public void setSuccessor(soundHandler next){
this.successor=next ;
}
}