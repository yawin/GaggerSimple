package powerzhou.com.testapp.injector;


import dagger.Module;
import dagger.Provides;
import powerzhou.com.testapp.IPresentor;
import powerzhou.com.testapp.UserActivity;
import powerzhou.com.testapp.UserPresentor;
import powerzhou.com.testapp.Utils;
import powerzhou.com.testapp.injector.annotion.PerActivity;

/**
 * Created by power on 10/3/2017.
 */
@Module
public class UserModule {

    private final UserActivity mView;

    public UserModule(UserActivity mView){
        this.mView = mView;
    }
//    @PerActivity
//    @Provides
//    public IPresentor getProvidePersentor(Utils utils){
//        return new UserPresentor(utils);
//    }
}
