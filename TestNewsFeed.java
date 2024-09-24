/*
 * Klasse erzeugt Exemplare zum Testen
 * 
 */


public class TestNewsFeed{
    public void testeMeinNewsFeed()   {
        NewsFeed n = new NewsFeed();
        MessagePost m = new MessagePost("Leonardo Da Vinci", "Hatte eine tolle Idee, die ich leider vergessen habe. Hatte was mit Fliegen zu tun.");
        m.like(); m.like();
        m.addComment("Leonard, Du bist ein Genie!");
        
        PhotoPost p = new PhotoPost("Alexander Graham Bell", "Apparat zum Sprechen über weite Entfernungen" , "telefon.jpg");
        
        n.addMessagePost(m);
        n.addPhotoPost(p);
        n.show();
        
    }
}
