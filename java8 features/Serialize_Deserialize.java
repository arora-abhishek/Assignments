import java.io.*;
public class Serialize_Deserialize implements  Serializable {

        String name;
        int rid;
        static String contact;


        Serialize_Deserialize(String n, int r, String c)
        {
            this.name = n;
            this.rid = r;
            this.contact = c;
        }


      public static void main(String[] args)
        {
            try
            {
                Serialize_Deserialize si = new Serialize_Deserialize("Abhishek", 2826, "110044");
                FileOutputStream fos = new FileOutputStream("Serial.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(si);
                oos.close();
                fos.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

}

class deserialize_serialize{
    public static void main(String[] args) {

        Serialize_Deserialize si=null ;
        try
        {
            FileInputStream fis = new FileInputStream("Serial.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (Serialize_Deserialize) ois.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(si.name);
        System.out. println(si.rid);
        System.out.println(si.contact);
    }
}