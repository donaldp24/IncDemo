package com.general.mediaplayer.IncDemo;

/**
 * Created with IntelliJ IDEA.
 * User: Donald Pae
 * Date: 1/17/14
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonData {


    // no taps for a long time, type of action
    public static final int ACTION_VIDEOPLAY = 0;
    public static final int ACTION_BACKTOMAIN = 1;

    public static final int ACTION_NOTAP = ACTION_BACKTOMAIN;
    public static final int TIME_ACTION_NOTAP = 60; //60 seconds

    // playing video time from no interaction (in seconds)
    public static final int VIDEO_LOOPING = 1;
    public static final int START_SERVER = 1;


    // You have to set this flag as 1 to be enable lighting.
    public static final int LIGHT_NONE = -1;
    public static final int LIGHT_COMM = 0;
    public static final int LIGHT_USBHID = 1;

    public static final int LIGHT_MODE = LIGHT_COMM;


    //enum for transform
    public static final int TRANSFORM_ALPHA_FADE = 0;
    public static final int TRANSFORM_TRANSFORM_SLIDE = 1;
    public static final int TRANSFORM_ALPHA_SLIDE = 2;

    public static final int transformAnimation = TRANSFORM_ALPHA_SLIDE; //trans_0


    // these are subids for lights of every kind-------------------------------------------------------
    public static final int SUBID_INC1 = 0;
    public static final int SUBID_INC2 = 1;

    public static final int VIDEO_HP = 0;
    public static final int VIDEO_EPSON = 1;
    public static final String PARAM_VIDEO = "param_video";


    // initialize Suitable option and ...
    public static void initialize()
    {

    }

}
