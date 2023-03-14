interface Template extends Remote{
    int add(int x, inty);
}

class TemplateUsage implements Template extends UnicastRemoteObject{
    public int add(int x, int y){
        super();
        return x+y;
    }
}


//Do the following
rmic Templateusage to make the stub and skeleton

//Run it in the port
rmiregistry 5000

//Creating the client 
public class Work{
    public void main(String []args){
        TemplateUsage stub = new TemplateUsage();
        Naming.rebind("rmi://localhost:5000/sono",stub)
    }
}

//Creating the server
public class WorkServer{
    public void main(String[] args){
        TemplateUsage skeleton = Naming.lookup("rmi://localhost:5000/sono");
        skeleton.add(100,100);
    }
}
