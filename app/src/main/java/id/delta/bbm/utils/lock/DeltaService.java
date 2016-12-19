package id.delta.bbm.utils.lock;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by DELTALABS on 12/19/16.
 */

public abstract class DeltaService extends Service {

    abstract public void onServiceCreate(Context cont);
    abstract public void onStart(Intent intent, int flags, int startId);
    abstract public void onServiceBind(Intent intent);


    @Override
    public void onCreate()
    {
        Context cont = getApplicationContext();
        super.onCreate();

        onServiceCreate(cont);
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        onStart(intent, flags, startId);
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public IBinder onBind(Intent intent)
    {
        onServiceBind(intent);
        return null;
    }

}
