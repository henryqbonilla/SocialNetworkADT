package SocialNetworkPackage;
import java.util.*;

public class Network_Handler 
{
    private Profiles p = new Profiles();
    
    Network_Handler()
    {
        System.out.println("network created");
    }
    
    public Profile getProfile(String name)
    {
        return p.getProfile(name);
    }
    
    public void createAccount(String accountName)
    {
        p.addAccount(accountName);
    }
    
    public void deleteAccount(String name)
    {
        p.removeAccount(name);
    }
}
