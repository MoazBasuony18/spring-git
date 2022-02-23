package elakeed.webapps.springgit.service;


import elakeed.webapps.springgit.model.Friend;
import elakeed.webapps.springgit.repository.FriendDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    private FriendDAO friendDAO;

    @Autowired
    public FriendService(FriendDAO friendDAO) {
        this.friendDAO = friendDAO;
    }

    public List<Friend> getAllFriends() {
        return this.friendDAO.getALlFriends();
    }

    public Friend getFriendById(Integer id) {
        return this.friendDAO.getFriendById(id);
    }

    public void deleteFriendById(Integer id) {
        this.friendDAO.deleteFriendById(id);
    }
}
