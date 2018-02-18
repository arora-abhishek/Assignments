import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection_prog {
    public static String name;
    public static int id;
    
    Reflection_prog(String name, int id)
    {
        this.id=id;
        this.name=name;
    }
    
    public void display()
    {
        System.out.println("name :"+name+" id :"+id);
    }

    public static void main(String[] args) {

        Reflection_prog obj=new Reflection_prog("Abhishek",285);
        obj.display();

      try {

          Field nameField1 = obj.getClass().getField("name");

          Field nameField2 = obj.getClass().getField("id");
          Method nameField = obj.getClass().getMethod("display");
          Object value1 = nameField1.get(obj);
          Object value2 = nameField2.get(obj);

          System.out.println(value1);
          System.out.println(value2);
          System.out.println(nameField);

      }
      catch(NoSuchFieldException e )
        {
            e.printStackTrace();

        }
        catch(IllegalAccessException e )
        {
            e.printStackTrace();
        }
        catch(NoSuchMethodException e )
        {
            e.printStackTrace();
        }
    }
}
