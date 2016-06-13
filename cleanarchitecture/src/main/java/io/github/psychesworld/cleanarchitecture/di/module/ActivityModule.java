package io.github.psychesworld.cleanarchitecture.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import io.github.psychesworld.cleanarchitecture.di.qualifier.ForActivity;

@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ForActivity
    Context provideActivityContext() {
        return activity;
    }
}
