import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

//FileReader로 바꾸면 됨 그리고 in.read >> 문자만
//read.byte
public class Main {
    public static void main(String[] args) {
        


    }


}
/*
        try {


                }catch (IOException e) {
                e.printStackTrace();
                }

 */
        /*
        byte[] team = new byte[4];
        byte[] origianl = new byte[]{0,1,2,3,4,5,6,7,8,9};
        ByteArrayInputStream in = new ByteArrayInputStream(origianl);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.out.println("before");
        System.out.println(Arrays.toString(out.toByteArray()));

        while(in.available() > 0) {

            try {
                int count = in.read(team);
                System.out.println(count);
                in.read(team);
                out.write(team);
                System.out.println("temp" + Arrays.toString(out.toByteArray()));

            }catch (IOException e) {
                e.printStackTrace();
            }

            }
        System.out.println("after");
        System.out.println(Arrays.toString(out.toByteArray()));

        }
        */
        /*
        int data = 0x01020304;
        ByteBuffer buffer = ByteBuffer.allocate(4);

        buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.putInt(data);
        byte[] result = buffer.array();
        System.out.println(Arrays.toString(result));

         */


// 버퍼만들고 빅엔디안사용 한것. array 로 바이트로 바꿈.
