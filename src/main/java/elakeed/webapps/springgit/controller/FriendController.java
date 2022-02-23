package elakeed.webapps.springgit.controller;

import elakeed.webapps.springgit.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/friends")
public class FriendController {

    //kosmok
    private FriendService friendService;


    @Autowired
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping
    public String friendsPage(Model model) {
        model.addAttribute("friends", this.friendService.getAllFriends());
        return "friends";
    }
}
