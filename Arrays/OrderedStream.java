package Arrays;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    String [] list;
    int ptr;
    public OrderedStream(int n) {
        list = new String[n];
        ptr = 0;
    }

    public List<String> insert(int idKey, String value) {
        List<String> res = new ArrayList<>();
        list[idKey-1] = value;
        while (ptr<list.length && list[ptr]!=null) {
            res.add(list[ptr++]);
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
        os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
        os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
    }
}
