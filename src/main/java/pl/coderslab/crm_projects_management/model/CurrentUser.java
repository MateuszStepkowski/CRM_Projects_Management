package pl.coderslab.crm_projects_management.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User {

    private final pl.coderslab.crm_projects_management.entity.User user;

    public CurrentUser(String login,
                       String password,
                       Collection<? extends GrantedAuthority> authorities,
                       pl.coderslab.crm_projects_management.entity.User user) {
        super(login, password, authorities);
        this.user = user;
    }

    public pl.coderslab.crm_projects_management.entity.User getUser() {
        return user;
    }
}