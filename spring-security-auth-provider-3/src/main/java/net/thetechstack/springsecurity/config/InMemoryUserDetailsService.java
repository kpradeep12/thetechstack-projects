package net.thetechstack.springsecurity.config;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public class InMemoryUserDetailsService implements UserDetailsService {
    private final List<UserDetails> users =
            List.of(User.builder().username("john").password("test").authorities("READ").build(),
            User.builder().username("adam").password("test").authorities("READ").build(),
            User.builder().username("david").password("test").authorities("ADMIN").build());

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<UserDetails> user = users.stream()
                .filter(userDetails -> userDetails.getUsername().equals(s))
                .findFirst();

        if(user.isEmpty())
            throw new UsernameNotFoundException("User " + s + " not found");

        return user.get();
    }
}
