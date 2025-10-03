import java.util.Arrays;

class q{
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        sol sol = new sol();
        System.out.println(sol.reconstructQueue(people));
    }
}
class sol{
    public int[][] reconstructQueue(int[][] people){
        Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        for(int i =1;i<people.length;i++){
            
        }


        for(int[] a: people){
            for(int l: a){
                System.out.print(l + " ");
            }
            System.out.println();
        }
        return people;
    }
}