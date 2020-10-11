package com.example.featuretoggle;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum GreetingFeatures implements Feature {
    @Label("Holiday")
    HOLIDAY;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
