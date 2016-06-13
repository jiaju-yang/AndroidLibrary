package io.github.psychesworld.library.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.psychesworld.cleanarchitecture.di.qualifier.ForApplication;
import io.github.psychesworld.library.presentation.AndroidApplication;

@Module
public class ApplicationModule {
    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return application;
    }
}
