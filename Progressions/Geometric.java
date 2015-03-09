
public class Geometric {
    boolean flagGeom = true;

    public boolean geomProg(int arr[]) {
        int[] diff = new int[arr.length-1];
        //we are calculate difference between elements in arr[]
        for (int i = 0; i < arr.length - 1; i++) {
            diff[i] = arr[i + 1] / arr[i];
        }
        //now we are validate diff []
        for (int y = 0; y < diff.length - 1; y++) {
            if (diff[y] == diff[y + 1]) {
                flagGeom = true;
            } else {
                flagGeom = false;
                break;
            }
        }
        return flagGeom;
    }



}
