package collections.list;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AList {
    public static void main(String[] args) {

        List<Citizen> l = new ArrayList<>();
        l.add(new Citizen("Ani",431,"Singh"));
        l.add(new Citizen("Mama",488,"Singh"));
        l.add(new Citizen("Brother",430,"Singh"));
        Collections.sort(l,new CitizenSort());


       for(int i=0; i<l.size(); i++){
           Citizen c = l.get(i);
           System.out.println(c.citizenId);
       }


        //Comparator interface has 2 functions compare and equal
        //This interface is present in java.util package and contains 2 methods
        // compare(Object obj1, Object obj2) and equals(Object element).
        // Using a comparator, we can sort the elements based on data members.
        // For instance, it may be on roll no, name, age, or anything else.

    }
}
