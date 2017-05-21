package io.github.atomfrede.jhipster.togglz.example.config.togglz;

import io.github.atomfrede.jhipster.togglz.example.security.AuthoritiesConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;
import org.togglz.core.user.UserProvider;
import org.togglz.spring.security.SpringSecurityUserProvider;

@Configuration
public class TogglzConfig {

    @Bean
    public FeatureProvider featureProvider() {
        return new EnumBasedFeatureProvider(ApplicationFeatures.class);
    }

    @Bean
    public UserProvider userProvider() {

        return new SpringSecurityUserProvider(AuthoritiesConstants.ADMIN);
    }
}
