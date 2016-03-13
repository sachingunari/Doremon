public  class soundClient 
{
private soundHandler h1=new concreteHandler1();
private soundHandler h2=new concreteHandler2();
private soundHandler h3=new concreteHandler3();



public soundClient()
{
h1.setSuccessor(h2);
h2.setSuccessor(h3);

}

public soundHandler geth1()
{
return h1;
}

public void handleSound(String command)
{
h1.handleRequest(command);
}

}