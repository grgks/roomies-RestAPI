package com.happy.roomies.util;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * loads @EnableJpaAuditing without it DataJpaTest do not activate JPA auditing
 * and save fails because UserRepository extends AbstractRepository
 * and Hibernate have to fill auditing fields.
 */

@TestConfiguration
@EnableJpaAuditing
public class TestJpaConfig {
}
