package elakeed.webapps.springgit.repository;

import elakeed.webapps.springgit.model.Friend;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class FriendDAO {

    private List<Friend> friends = new ArrayList<>(Arrays.asList(new Friend(1, "Elakeed"), new Friend(2, "Moaz"), new Friend(3, "Mo'men")));

    public List<Friend> getALlFriends() {
        return this.friends;
    }

    public Friend getFriendById(Integer id) {
        for (Friend friend : this.friends) {
            if (friend.getId() == id)
                return friend;
        }
        return null;
    }

    public void deleteFriendById(Integer id) {
        for (Friend friend : this.friends) {
            if (friend.getId() == id) {
                this.friends.remove(friend);
                break;
            }
        }
    }
}
