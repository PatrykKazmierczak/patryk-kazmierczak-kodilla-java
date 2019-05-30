package chellenges;

public class MailInformationService implements InformationService {
    public  void inform(User user){
        System.out.println ("User " + user.getUserName () + " informed.");
    }
}
