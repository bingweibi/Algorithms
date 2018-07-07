import java.util.*;

/**
 * @author bibingwei
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int payload_len = s.nextInt();
        int insert_len = s.nextInt();
        ArrayList<String> pbuf = new ArrayList<>();
        while (!s.hasNext("end")){
            pbuf.add(s.next());
        }
        for (int i=0;i<pbuf.size();i++){
            if ((Integer.parseInt(pbuf.get(i).substring(2)) - Integer.parseInt(pbuf.get(i).substring(0,1)) == payload_len)){
                System.out.println(pbuf.get(i));
            }else if (((Integer.parseInt(pbuf.get(i).substring(2))- Integer.parseInt(pbuf.get(i).substring(0,1))< payload_len)) ){
                if (((Integer.parseInt(pbuf.get(i).substring(2)) + insert_len) >= payload_len)){
                    System.out.println(Integer.parseInt(pbuf.get(i).substring(0,1))+","  + payload_len);
                    insert_len -= payload_len - Integer.parseInt(pbuf.get(i).substring(0,1))-Integer.parseInt(pbuf.get(i).substring(2));
                }else {
                    System.out.println(Integer.parseInt(pbuf.get(i).substring(0,1))+"," + (Integer.parseInt(pbuf.get(i).substring(2)) + insert_len));
                    insert_len -= payload_len - Integer.parseInt(pbuf.get(i).substring(0,1))-Integer.parseInt(pbuf.get(i).substring(2));
                }
            }
        }
        if (insert_len > 0){
            System.out.println("0," + insert_len);
        }
    }
}