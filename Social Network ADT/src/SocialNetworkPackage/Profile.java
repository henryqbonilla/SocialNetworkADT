package SocialNetworkPackage;
import java.util.*;

public class Profile 
{
    private static int id_count = 1;
    private int id;
    private String name;
    private String status;
    private ArrayList<String> friends;
    
    public Profile(String name, String status)
    {
        this.name = name;
        this.status = status;
        friends = new ArrayList<>();
        id = id_count;
        id_count++;
    }
    
    public Profile(String name)
    {
        id = id_count;
        id_count++;
        this.name = name;
        status = "No status";
        friends = new ArrayList<>();
    }

    Profile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addFriend(String friend)
    {
        friends.add(friend);
    }
    
    public int getID()
    {
        return id;
    }
    
    public ArrayList<String> getFriends()
    {
        return friends;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public void deleteFriend(String name)
    {
        for(int i = 0; i < friends.size(); i++)
        {
            if(friends.get(i).equalsIgnoreCase(name))
                friends.remove(i);
        }
    }


}
