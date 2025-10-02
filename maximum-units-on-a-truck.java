import java.util.*;
class maxUnits{
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        fail sol = new fail();
        System.out.println(sol.maximumUnits(boxTypes, truckSize));
    }
}
class fail {

    
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        int totalUnits = 0;
        for(int i =0;i<boxTypes.length;i++){
            if(truckSize>=boxTypes[i][0]){
                totalUnits += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }else if(truckSize<boxTypes[i][0]){
                totalUnits += truckSize*boxTypes[i][1];
                truckSize = 0;
            }
            if(truckSize == 0){
                break;
            }

        }
        return totalUnits;
    }
}