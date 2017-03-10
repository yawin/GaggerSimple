package powerzhou.com.testapp.injector;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import powerzhou.com.testapp.AndroidApplication;
import powerzhou.com.testapp.BaseActivity;
import powerzhou.com.testapp.UserActivity;
import powerzhou.com.testapp.Utils;

/**
 * Created by power on 10/3/2017.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(AndroidApplication application);

    Context context();
//
    Utils getUtils();
}
