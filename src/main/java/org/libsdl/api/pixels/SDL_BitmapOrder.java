package org.libsdl.api.pixels;

import org.libsdl.jna.JnaEnum;

public final class SDL_BitmapOrder implements JnaEnum {

    public static final int SDL_BITMAPORDER_NONE = 0;
    public static final int SDL_BITMAPORDER_4321 = 1;
    public static final int SDL_BITMAPORDER_1234 = 2;

    private SDL_BitmapOrder() {
    }
}
