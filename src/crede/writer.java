import java.util.LinkedList;

public class writer
{
    private LinkedList org=new LinkedList();
    
    public void addVeri(Object o){
    org.addFirst(o);  
    }
    
    public Object silVeri(){
        org.removeLast();
    return org.toString();
    }
   public static void main(String [] args)
   {
       writer abc=new writer();
       
    String u1=new String("istanbul");
    String u2=new String("ankara");
    String u3=new String("izmir");
   
   abc.addVeri(u3);
   abc.addVeri(u2);
   System.out.println("----->"+abc.silVeri());
   abc.addVeri(u1);
   System.out.println("----->"+abc.silVeri());
   
   }
}

