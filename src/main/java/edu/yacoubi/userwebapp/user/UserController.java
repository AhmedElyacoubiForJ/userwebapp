package edu.yacoubi.userwebapp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repository;

    @GetMapping("/users")
    public String showUserList(Model model) {
        Iterable<User> listUsers = repository.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }
}
