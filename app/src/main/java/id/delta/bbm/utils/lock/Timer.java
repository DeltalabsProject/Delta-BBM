package id.delta.bbm.utils.lock;

import android.os.Handler;

/**
 * Created by DELTALABS on 12/19/16.
 */

public class Timer {

    public interface OnTimerEvent
    {
        void onTimer(String id);
    }

    private OnTimerEvent procTimer;
    private long timerInterval;
    private String timerID;
    private Handler timerHandler = new Handler();
    long timeInMilliseconds = 0L;


    public void SetOnTimerEvent(String id, long interval, OnTimerEvent onTimerEvent)
    {
        timerID=id;
        timerInterval=interval;
        procTimer=onTimerEvent;
    }


    public void StartTimer()
    {
        timerHandler.postDelayed(timerThread, timerInterval);
    }


    public void StopTimer()
    {
        timerHandler.removeCallbacks(timerThread);
    }


    private Runnable timerThread = new Runnable()
    {
        @Override
        public void run()
        {
            procTimer.onTimer(timerID);
            StartTimer();
        }
    };
}
