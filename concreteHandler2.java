import greenfoot.*;

public class concreteHandler2 implements soundHandler{

private soundHandler successor=null;
private GreenfootSound sound=new GreenfootSound("yum.wav");
private GreenfootSound sounds=new GreenfootSound("Aww.mp3");


public void handleRequest(String request){

if(request.equals("eaten"))
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