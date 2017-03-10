package powerzhou.com.testapp.injector;

import dagger.Component;
import powerzhou.com.testapp.UserActivity;
import powerzhou.com.testapp.injector.annotion.PerActivity;

/**
 * Created by power on 10/3/2017.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules= {ActivityModule.class,UserModule.class})
public interface UserComponent extends ActivityComponent{
//    void inject(UserActivity userActivity);
}
