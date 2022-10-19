import java.io.*;

public class person implements Serializable {  //serializable >> 직렬
    public  static  String type = "A";
    public String name; //이게 인스턴스 static 없으면 아래 동일 이거만 매번부름
    public int number;

    public person(String name, int number) {

        this.name = name;
        this.number = number;
    }



    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        person.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public  void hello(String person) {
        System.out.println("hello" + person + "!");
        System.out.println("i am" + name);
    }


}
