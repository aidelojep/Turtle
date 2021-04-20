package OurDiary;

public class User {
    
    private final Diary diary;
    
    public User(String kemi, Diary relationshipDiary) {
    diary =relationshipDiary;
    }

    public Diary getDiary() {
    return diary;
    }

    public void createEntry(String s) {
    }
}
