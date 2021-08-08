/*package net.thetechstack.livespadesscore.config;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class InMemoryUserDetailService implements UserDetailsService{
    private final List<UserDetails> users;
    
    public InMemoryUserDetailService(List<UserDetails> users) {
        this.users = users;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return users.stream()
        .filter(user -> user.getUsername().equals(username))
        .findFirst()
        .orElseThrow(() -> new UsernameNotFoundException(username + " not found"));
    }
    
}
*/