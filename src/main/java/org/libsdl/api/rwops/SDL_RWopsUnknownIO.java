package org.libsdl.api.rwops;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({
        "data1",
        "data2"
})
public final class SDL_RWopsUnknownIO extends Structure {

    public Pointer data1;
    public Pointer data2;
}
