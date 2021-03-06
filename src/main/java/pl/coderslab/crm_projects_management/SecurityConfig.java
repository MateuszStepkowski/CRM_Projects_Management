package pl.coderslab.crm_projects_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pl.coderslab.crm_projects_management.service.SpringDataUserDetailsService;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    DataSource dataSource;


    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public SpringDataUserDetailsService customUserDetailsService() {
        return new SpringDataUserDetailsService();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().permitAll()
                .antMatchers("**/edit/**").authenticated()
                .antMatchers("**/delete/**").authenticated()
                .antMatchers("**/add/**").authenticated()
                .and().formLogin().defaultSuccessUrl("/home")
                .and().logout().logoutSuccessUrl("/home");
    }


}