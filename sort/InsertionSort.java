package sort;

public class InsertionSort {
    static int[] list = {1, 2, 5, 6, 8, 5, 4, -5, 5, 5};

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
      insertionSort(list);
      for(int i : list){
          System.out.print(i + " ");
      }
    }
}
