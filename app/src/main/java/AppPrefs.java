import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Chirag on 07-11-2014.
 */
public class AppPrefs {
    private static final String USER_PREFS = "USER_PREFS";
    private SharedPreferences appSharedPrefs;
    private SharedPreferences.Editor prefsEditor;
    private String sConfPosition = "pos";


    public AppPrefs(Context context) {
        this.appSharedPrefs = context.getSharedPreferences(USER_PREFS,
                Activity.MODE_PRIVATE);
        this.prefsEditor = appSharedPrefs.edit();
    }

    //Levels
    public int getLevel() {
        return appSharedPrefs.getInt(sConfPosition, 1);
    }

    public void setLevel(int _level) {
        prefsEditor.putInt(sConfPosition, _level).commit();
    }
}