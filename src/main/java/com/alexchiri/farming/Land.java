package com.alexchiri.farming;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Alexandru Chiritescu
 * 30-12-12
 */
public class Land extends AbstractModule {
    @Override
    protected void configure() {
        bind(Weather.class).toProvider(GodFactor.class).in(Singleton.class);
    }
}
