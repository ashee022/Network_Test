import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        saveobject();
        loadObject();
        serial();
        serial2();
        deseri02();
    }

        public static void loadObject() {

            try {
                FileInputStream filein = new FileInputStream("./myobject"); //아래에 넣어서 수정
                DataInputStream datain = new DataInputStream(filein);
                int number = datain.readInt();
                String name = datain.readUTF();
                person stave = new person(name, number);

                number = datain.readInt();
                name = datain.readUTF();
                person tom = new person(name, number);

                System.out.println(stave);
                System.out.println(tom);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        public  static  void deseri02() {

            try {
                FileInputStream fileOut = new FileInputStream("./myserial");
                ObjectInputStream objOut= new ObjectInputStream(fileOut);
                ArrayList<person> savedlist = (ArrayList<person>) objOut.readObject();
                for (int i = 0; i < savedlist.size(); i ++){
                    System.out.println(savedlist.get(i));
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }


        }

        public  static  void serial2() {


            FileOutputStream fileOut = null;
            try {
                person stave = new person( "stave", 111);
                person tom = new person( "tom", 111);
                ArrayList<person> persons = new ArrayList<>();
                fileOut = new FileOutputStream("./myserial2");
                ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
                objOut.writeObject(persons);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    public static  void serial() {
        person stave = new person( "stave", 111);
        person tom = new person( "tom", 111);


        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("./myserial");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(stave);
            objOut.writeObject(tom);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


        public static void saveobject() {
            person stave = new person( "stave", 111);
            person tom = new person( "tom", 111);
            System.out.println(stave);
            System.out.println(tom);

            try  {
                FileOutputStream fileOut = new FileOutputStream("./myobject");
                DataOutputStream dataOut = new DataOutputStream(fileOut);
                dataOut.writeInt(stave.getNumber());
                dataOut.writeUTF(stave.getName());
                dataOut.writeInt(tom.getNumber()); //int 부터 써야댐 *****
                dataOut.writeUTF(tom.getName());
                fileOut.close();


            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }




