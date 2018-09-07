package Text;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Jingdong03 {
    public static void main(String[] args) throws IOException {

        Calendar calendar1 = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
        calendar1.add(Calendar.DATE, -19);
        System.out.println(sdf1.format(calendar1.getTime()));
    }
}