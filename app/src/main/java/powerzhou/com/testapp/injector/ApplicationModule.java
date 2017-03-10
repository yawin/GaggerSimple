package powerzhou.com.testapp.injector;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import powerzhou.com.testapp.AndroidApplication;
import powerzhou.com.testapp.Utils;

/**
 * Created by power on 10/3/2017.
 */
@Module
public class ApplicationModule {
    private final AndroidApplication application;
    private final Utils utils;
    public ApplicationModule(AndroidApplication application,Utils utils){
        this.application = application;
        this.utils = utils;
    }
    @Provides
    @Singleton
    public Context provideApplicationContext(){
        return this.application;
    }

    @Provides
    @Singleton
    public Utils getUtils(){
        return this.utils;
    }
}
