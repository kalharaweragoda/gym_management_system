package edu.kw.service.impl;

import edu.kw.repository.UserRepository;
import edu.kw.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

}
