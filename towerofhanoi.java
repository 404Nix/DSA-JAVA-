public class towerofhanoi {
    public static void main(String[] args) {
        tower_of_hanoi(3, 'A', 'B', 'C');
    }
    static void tower_of_hanoi(int n, char A, char B, char C){
        if (n>0) {
            tower_of_hanoi(n-1, A, C, B);
            System.out.printf("Move disk %d From %c to %c\n", n, A, C);
            tower_of_hanoi(n-1, B, A, C);
        }
        
    }
}
