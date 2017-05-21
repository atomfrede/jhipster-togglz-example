package io.github.atomfrede.jhipster.togglz.example.config.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum ApplicationFeatures implements Feature {


    @EnabledByDefault
    @Label("New users can register")
    FEATURE_REGISTER_NEW_USERS;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

}
