package com.ymsoftlabs.widgets;

/**
 * Created by yus on 6/1/2015.
 */
public interface JoystickMovedListener {
    public void OnMoved(int pan, int tilt);
    public void OnReleased();
    public void OnReturnedToCenter();
}
