package org.libsdl.api.pixels;

import org.libsdl.jna.JnaEnum;

public final class SDL_PixelType implements JnaEnum {

    public static final int SDL_PIXELTYPE_UNKNOWN = 0;
    public static final int SDL_PIXELTYPE_INDEX1 = 1;
    public static final int SDL_PIXELTYPE_INDEX4 = 2;
    public static final int SDL_PIXELTYPE_INDEX8 = 3;
    public static final int SDL_PIXELTYPE_PACKED8 = 4;
    public static final int SDL_PIXELTYPE_PACKED16 = 5;
    public static final int SDL_PIXELTYPE_PACKED32 = 6;
    public static final int SDL_PIXELTYPE_ARRAYU8 = 7;
    public static final int SDL_PIXELTYPE_ARRAYU16 = 8;
    public static final int SDL_PIXELTYPE_ARRAYU32 = 9;
    public static final int SDL_PIXELTYPE_ARRAYF16 = 10;
    public static final int SDL_PIXELTYPE_ARRAYF32 = 11;

    private SDL_PixelType() {
    }
}
