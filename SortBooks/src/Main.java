import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> set=new TreeSet<>(new OrderGeographicalOrder());
        set.add(new Book("A",200,"X",2001));
        set.add(new Book("C",202,"X",2001));
        set.add(new Book("B",201,"X",2001));
        set.add(new Book("E",204,"X",2001));
        set.add(new Book("D",203,"X",2001));

        Iterator<Book> iter =set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getName());
        }

        TreeSet<Book> set2=new TreeSet<>(new OrderByPageNumber());
        set2.add(new Book("A",200,"X",2001));
        set2.add(new Book("C",202,"X",2001));
        set2.add(new Book("B",201,"X",2001));
        set2.add(new Book("E",204,"X",2001));
        set2.add(new Book("D",203,"X",2001));

        Iterator<Book> iter2 =set2.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next().getPageNumber());
        }

    }
}