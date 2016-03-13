import greenfoot.*;

public class concreteHandler3 implements soundHandler{

private soundHandler successor=null;
private GreenfootSound sound=new GreenfootSound("eat.mp3");


public void handleRequest(String request){

if(request.equalsIgnoreCase("eat"))
{
sound.play();
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