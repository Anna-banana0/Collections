package collections.list;

import java.util.Comparator;

public class CitizenSort implements Comparator<Citizen> {
    @Override
    public int compare(Citizen c1, Citizen c2) {
       return (c1.citizenId)-(c2.citizenId);
    }
}
