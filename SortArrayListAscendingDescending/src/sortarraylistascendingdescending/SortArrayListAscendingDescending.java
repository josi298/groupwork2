package sortarraylistascendingdescending;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListAscendingDescending {
    public ArrayList arrayList;
    public SortArrayListAscendingDescending(ArrayList arrayList) {
        this.arrayList = arrayList;
    }
    public ArrayList getArrayList() {
        return this.arrayList;
    }
    public ArrayList sortAscending() {
        Collections.sort(this.arrayList);
        return this.arrayList;
    }
    public ArrayList sortDescending() {
        Collections.sort(this.arrayList, Collections.reverseOrder());
        return this.arrayList;
    }
}


