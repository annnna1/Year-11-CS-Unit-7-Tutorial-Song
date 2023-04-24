import java.util.ArrayList;
public class Song
{
    private String title;
    private String artist;
    private ArrayList<String> all;
    public Song(String t , String a)
    {
        title = t;
        artist = a;
        all = new ArrayList<>();
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public int howMany(ArrayList<String> ar)
    {
        int o = all.size();
        for(int i = 0 ; i < ar.size() ; i ++)
        {
            String s = ar.get(i).toLowerCase();
            boolean bool = false;
            for(int j = 0 ; j < all.size() ; j ++)
            {
                if(s.equals(all.get(j)))
                {
                    bool = true;
                }
            }
            if(!bool)
            {
                all.add(s);
            }
        }
        return (all.size() - o);
    }
}
