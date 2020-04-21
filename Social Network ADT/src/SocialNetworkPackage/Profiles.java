package SocialNetworkPackage;
import java.util.*;

public class Profiles 
{
    LinkedList<Profile> members;
    
    public Profiles()
    {
        
        //adding accounts to network
        members = new LinkedList<>();
        members.add(new Profile("Jessika","Future Top Chef!"));
        members.add(new Profile("Henry","Is there an off button to this life thing?"));
        members.add(new Profile("Ulises","Music is my life. Guitar is my breath."));
        members.add(new Profile("Yasmin","Love to get mad at people for no reason."));
        members.add(new Profile("Colleen", "Don't wanna be alone forever...anyone?"));
        members.add(new Profile("Abdul", "Loving my new puppy, cat not liking so much though."));
        //Adding friends to members
        //Add Jessika's Friends
        Profile temp = members.get(0);
        temp.addFriend(members.get(2).getName());
        temp.addFriend(members.get(3).getName());
        temp.addFriend(members.get(5).getName());
  
        //Add Henry's Friends
        temp = members.get(1);
        temp.addFriend(members.get(2).getName());
        temp.addFriend(members.get(3).getName());
        temp.addFriend(members.get(5).getName());
        
        //add Ulises's Friends
        temp = members.get(2);
        temp.addFriend(members.get(0).getName());
        temp.addFriend(members.get(1).getName());
        
        //add Yasmin's Friends
        temp = members.get(3);
        temp.addFriend(members.get(1).getName());
        temp.addFriend(members.get(0).getName());
        temp.addFriend(members.get(4).getName());
        
        //add Colleen's Friends
        temp = members.get(4);
        temp.addFriend(members.get(3).getName());
        
        //add Abdul's Friends
        temp = members.get(5);
        temp.addFriend(members.get(0).getName());
        temp.addFriend(members.get(1).getName());
        
    }
    
    private int search(String name)
    {
        int index = -1;
        
        for (int i =0; i < members.size(); i++)
        {
            if (name.equalsIgnoreCase(members.get(i).getName()))
            {
            index = i;
            }
        }
      
        return index;
    }
   
    
    public Profile getProfile(String name)
    {
        int index = search(name);
        if(index == -1)
            return null;
        else
            return members.get(index);
    }
    
    public void addAccount(String accountName)
    {
        members.add(new Profile(accountName));
        for (int i = 0; i < members.size(); i++)
            System.out.println(members.get(i).getName());
    }
    
    public void removeAccount(String name)
    {
        int index = search(name);
        Profile p = members.get(index);
        ArrayList<String> accFriends = p.getFriends();
        
        for(int i = 0; i < accFriends.size(); i ++)
        {
            String f = accFriends.get(i);
            Profile fprofile = members.get(search(f));
            fprofile.deleteFriend(p.getName());
        }
        
        members.remove(index);
    }
}
