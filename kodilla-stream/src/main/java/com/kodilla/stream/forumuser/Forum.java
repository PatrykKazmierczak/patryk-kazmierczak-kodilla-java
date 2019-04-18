package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1,"Patryk",'M',"1990-06-05",12 ));
        theForumUserList.add(new ForumUser(2,"Agata",'F',"1990-05-05",20 ));
        theForumUserList.add(new ForumUser(3,"Bartek",'M',"2000-05-07",1 ));
        theForumUserList.add(new ForumUser(4,"Anna",'F',"1900-04-08",17 ));
        theForumUserList.add(new ForumUser(5,"Piotrek",'M',"2000-07-03",28 ));
        theForumUserList.add(new ForumUser(6,"Emil",'M',"1987-08-01",10 ));
    }
    public List<ForumUser>getUserList(){
        return new ArrayList<>(theForumUserList);
    }
}
