package org.libsdl.api.video;

import org.libsdl.jna.JnaEnum;

public final class SDL_HitTestResult implements JnaEnum {

    public static final int SDL_HITTEST_NORMAL = 0;
    public static final int SDL_HITTEST_DRAGGABLE = 1;
    public static final int SDL_HITTEST_RESIZE_TOPLEFT = 2;
    public static final int SDL_HITTEST_RESIZE_TOP = 3;
    public static final int SDL_HITTEST_RESIZE_TOPRIGHT = 4;
    public static final int SDL_HITTEST_RESIZE_RIGHT = 5;
    public static final int SDL_HITTEST_RESIZE_BOTTOMRIGHT = 6;
    public static final int SDL_HITTEST_RESIZE_BOTTOM = 7;
    public static final int SDL_HITTEST_RESIZE_BOTTOMLEFT = 8;
    public static final int SDL_HITTEST_RESIZE_LEFT = 9;

    private SDL_HitTestResult() {
    }
}
