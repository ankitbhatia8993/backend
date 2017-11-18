package com.backend.service.manager;

import com.backend.service.entry.UserEntry;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ankit Bhatia on 12/17/16.
 */

public interface UserManager {
    @Transactional
    UserEntry findById(Long id);
}
