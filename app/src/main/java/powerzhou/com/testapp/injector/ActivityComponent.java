package powerzhou.com.testapp.injector;

import android.app.Activity;
import android.content.Context;

import dagger.Component;
import powerzhou.com.testapp.IPresentor;
import powerzhou.com.testapp.UserActivity;
import powerzhou.com.testapp.Utils;
import powerzhou.com.testapp.injector.annotion.PerActivity;

/**
 * Created by power on 10/3/2017.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(UserActivity userActivity);

//    IPresentor getProvidePersentor(Utils utils, Context mContext);
//
//    IPresentor getProvidePersentor(Context mContext);
}
