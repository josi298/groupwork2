
package sortarraylistascendingdescending;


import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class SortArrayListAscendingDescendingTest {
    @Test
    public void testSortAscendingDescending() throws Exception {
        ArrayList countryList = new ArrayList<>();
        countryList.add("France");
        countryList.add("USA");
        countryList.add("India");
        countryList.add("Spain");
        countryList.add("England");
        SortArrayListAscendingDescending sortArrayList = new SortArrayListAscendingDescending(countryList);
        ArrayList unsortedArrayList = sortArrayList.getArrayList();
        System.out.println("Unsorted ArrayList: " + unsortedArrayList);
        ArrayList sortedArrayListAscending = sortArrayList.sortAscending();
        System.out.println("Sorted ArrayList in Ascending Order : " + sortedArrayListAscending);
        ArrayList sortedArrayListDescending = sortArrayList.sortDescending();
        System.out.println("Sorted ArrayList in Descending Order: " + sortedArrayListDescending);
    }
}

    
   