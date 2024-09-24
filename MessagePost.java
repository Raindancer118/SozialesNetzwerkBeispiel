import java.io.Serializable;
import java.util.ArrayList;
//----Das Import statement nicht nach moodle mitkopieren!!
public class MessagePost implements IPost {
    private String username;  // username of the post's author
    private String message;   // an arbitrarily long, multi-line message
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    public MessagePost(String author, String text)    {
        username = author;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like()   {
        likes++;
    }

    public void unlike(){
        if (likes > 0) {
            likes--;
        }
    }

    public void addComment(String text)    {
        comments.add(text);
    }

    public String getText()    {
        return message;
    }

    public long getTimeStamp() {
        return timestamp;
    }

    public void display() {
        System.out.println(username);
        System.out.println(message);
        System.out.print(timeString(timestamp));
        
        if(likes > 0) {
            System.out.println("  -  " + likes + " people like this.");
        }
        else {
            System.out.println();
        }
        
        if(comments.isEmpty()) {
            System.out.println("   No comments.");
        }
        else {
            System.out.println("   " + comments.size() + " comment(s). Click here to view.");
        }
    }

    private String timeString(long time) {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;      // time passed in milliseconds
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0) {
            return minutes + " minutes ago";
        }
        else {
            return seconds + " seconds ago";
        }
    }
}
