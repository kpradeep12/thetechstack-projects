/*package net.thetechstack.livespadesscore.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
    @Value("${livespadesscore.scorekeeper.username}")
    private String scorekeeperUsername;
    @Value("${livespadesscore.scorekeeper.password}")
    private String scorekeeperPassword;

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails scorekeeper = User.withUsername(scorekeeperUsername)
        .password(scorekeeperPassword)
        .authorities("read","write")
        .build();
        return new InMemoryUserDetailService(List.of(scorekeeper));
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/api/**").authenticated();
        http.csrf().disable();
	    http.headers().frameOptions().disable();
    }
}
*/