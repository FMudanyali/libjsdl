package org.libsdl.api.blendmode;

import com.sun.jna.ptr.IntByReference;
import org.intellij.lang.annotations.MagicConstant;
import org.libsdl.jna.JnaEnum;

public final class SDL_BlendFactor implements JnaEnum {

    public static final int SDL_BLENDFACTOR_ZERO = 0x1;
    public static final int SDL_BLENDFACTOR_ONE = 0x2;
    public static final int SDL_BLENDFACTOR_SRC_COLOR = 0x3;
    public static final int SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR = 0x4;
    public static final int SDL_BLENDFACTOR_SRC_ALPHA = 0x5;
    public static final int SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA = 0x6;
    public static final int SDL_BLENDFACTOR_DST_COLOR = 0x7;
    public static final int SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR = 0x8;
    public static final int SDL_BLENDFACTOR_DST_ALPHA = 0x9;
    public static final int SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA = 0xA;

    private SDL_BlendFactor() {
    }

    public static class Ref extends IntByReference {

        public Ref() {
        }

        public Ref(int ordinal) {
            super(ordinal);
        }

        @Override
        public void setValue(@MagicConstant(valuesFromClass = SDL_BlendFactor.class) int value) {
            super.setValue(value);
        }

        @Override
        @SuppressWarnings("MagicConstant")
        @MagicConstant(valuesFromClass = SDL_BlendFactor.class)
        public int getValue() {
            return super.getValue();
        }
    }
}
