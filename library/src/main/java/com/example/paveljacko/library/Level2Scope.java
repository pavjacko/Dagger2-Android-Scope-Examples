package com.example.paveljacko.library;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by paveljacko on 26/09/15.
 */
@Scope
@Retention(RUNTIME)
public @interface Level2Scope {
}
