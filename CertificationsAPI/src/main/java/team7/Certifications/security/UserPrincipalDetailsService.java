package team7.Certifications.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import team7.Certifications.entity.User;
import team7.Certifications.repository.UserRepository;

import java.util.Optional;


@Service
public class UserPrincipalDetailsService implements UserDetailsService {
    private UserRepository userRepository;

    public UserPrincipalDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = this.userRepository.findByName(s);
        UserPrincipal userPrincipal = new UserPrincipal(user.get());

        return userPrincipal;
    }
}