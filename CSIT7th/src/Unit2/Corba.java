interface Template{
    int add(int x,int y);
}

class TemplateBase extends Template{
    public int add(int x, int y){
        return x+y;
    }
}

public class Client{
    ORB orb = ORB.init(args,null);
    org.omg.CORBA.Object obj = orb.resolve_Initial_References("Name");
    NamingContext ext = NamingContextHelper.narrow(obj);
    TemplateBase temp = TemplateBase.narrow(ext.resolve_reference(ext));
    ext.add(40,40);
}
}
