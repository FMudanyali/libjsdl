package org.libsdl.api.rect;

import com.sun.jna.Structure;

@Structure.FieldOrder({
        "x",
        "y"
})
public final class SDL_Point extends Structure {

    public int x;
    public int y;
}