package io.github.psychesworld.library.di.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import io.github.psychesworld.cleanarchitecture.di.module.ThreadModule;
import io.github.psychesworld.cleanarchitecture.di.qualifier.ForApplication;
import io.github.psychesworld.library.di.module.ApplicationModule;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ThreadModule.class,
})
public interface ApplicationComponent {
    @ForApplication
    Context context();
}
