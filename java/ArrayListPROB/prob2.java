package ArrayListPROB;

import java.util.*;
//find if any pair in a sorted and rotated
//ArrayList has a target sum
//list = 11,15,6,8,9,10 target = 16

public class prob2 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairum2(list, target));

    }

    public static boolean pairum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                // breaking pt.
                bp = i;
                break;
            }
        }
        int lp = bp + 1;// smallest
        int rp = bp;// largest
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            if (list.get(lp) + list.get(rp) == target) {
                rp = (n + rp - 1) % n;
            }

        }
        return false;

    }
}
