package march_30_23_lab;

import java.util.ArrayList;

public class ListLoader {
    private ArrayList<Integer> L;

    public void loadList(Integer startNumber, Integer lastNumber) {
        L = new ArrayList<>();
        for(int i = startNumber; i <= lastNumber; i++) {
            L.add(i);
        }
    }

    public ArrayList<Integer> getList() {
        return L;
    }
    public static void main(String[] args) {
        ListLoader listLoader = new ListLoader();

        long startTime = System.currentTimeMillis();
        listLoader.loadList(0, 1000000);
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}