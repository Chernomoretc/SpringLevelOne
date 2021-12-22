package com.geekbrains.spring.web.services;

import com.geekbrains.spring.web.entities.Authority;
import com.geekbrains.spring.web.entities.User;
import com.geekbrains.spring.web.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
        private final UserRepository userRepository;

        public Optional<User> findByUsername(String username) {
            return userRepository.findByUsername(username);
        }

        @Override
        @Transactional
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            User user = findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(String.format("User '%s' not found", username)));
            System.out.println(user.toString());
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), mapRolesToAuthorities(user.getAuthorities()));
        }

        private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Authority> authorities) {
            return authorities.stream().map(authority -> {
                 SimpleGrantedAuthority s =   new SimpleGrantedAuthority(authority.getName());
                System.out.println(s.toString());
                return s;
            }).collect(Collectors.toList());
        }

    }
