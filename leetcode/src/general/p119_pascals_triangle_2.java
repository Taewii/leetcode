package general;

import java.util.ArrayList;
import java.util.List;

public class p119_pascals_triangle_2 {
    public static void main(String[] args) {
        List<Integer> getRow = getRow(30);
    }

    static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);

        row.add(1);
        for (int i = 0; i < rowIndex; i++) {
            int val = (int) ((long) row.get(i) * (rowIndex - i) / (i + 1));
            row.add(val);
        }

//        for (int i = 0; i < rowIndex + 1; i++) {
//            row.add(0, 1);
//            for (int j = 1; j < i; j++) {
//                row.set(j, row.get(j) + row.get(j + 1));
//            }
//        }

        return row;
    }
}
