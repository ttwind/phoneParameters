package phone.aso.com.phoneho.HooK;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
            //包名筛选，
            if (!lpparam.packageName.equals("")&&!lpparam.packageName.equals("")){

            }
    }
}
