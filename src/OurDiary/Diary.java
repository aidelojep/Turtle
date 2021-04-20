package OurDiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    List<Entry> entries = new ArrayList<>();

    public void addEntry(String s) {

        Entry entry = new Entry(s);
        entries.add(new Entry(s));

        //entries.add(new Entry(entryBody));
    }

    public int getTotalNumberOfEntry() {
        return entries.size();
    }
}
