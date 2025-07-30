    package Chapter_7;

public class Java_03_LinearSearch {

    public static int Search(int[] table, int key) {
        for(int i = 0; i<table.length; i++){
            if(table[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] table = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;

        int index = Search(table, key);
        if (index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at Index: " + index);
        }
    }
}
