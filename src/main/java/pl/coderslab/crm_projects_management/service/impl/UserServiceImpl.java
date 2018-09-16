package pl.coderslab.crm_projects_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.crm_projects_management.entity.Project;
import pl.coderslab.crm_projects_management.entity.User;
import pl.coderslab.crm_projects_management.repository.UserRepository;
import pl.coderslab.crm_projects_management.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;



    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


    @Override
    public User findByID(int id) {
        return userRepository.getOne(id);
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.findFirstByLogin(login);
    }

    @Override
    public User saveUserPasswordEncode(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User saveUserWithoutPasswordEncode(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllWhoInProject(Project project) {

        return userRepository.findAllByProjectsContains(project);
    }
}
