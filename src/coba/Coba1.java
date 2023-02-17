package coba;
public class Coba1 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        for (int i : array) {
            System.out.print(i+", ");
        }
        ubahArray(array);
        for (int i : array) {
            System.out.print(i+", ");
        }
        System.out.println("\b\b");
        int n = 1;
        System.out.println(n);
        ubahNilai(n);
        System.out.println(n);
    }
    
    static void ubahArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] += 5;
        }
    }
    static void ubahNilai(int n){
        n +=5;
    }
}
