interface Template{
    int add(int x, int y);
}

public class TemplateBase implements Template{
    public int add(int x, int y){
        return x+y;
    }
}


public class CLient{
    public static void main(String[] args){
        ORB orb = ORB.init(args, null);
        org.omg.CORBA.Object obj = orb.resolve("Name");
        NamingContextExt ext = NamingContextExtHelper.narrow(obj);
        TemplateBase temp = Template.narrow(ext);

        int res = temp.add(100, 100);
        System.out.println(res);
    }
}
