package org.libsdl.api.rwops;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({
        "append",
        "h",
        "buffer"
})
public final class SDL_RWopsWindowsIO extends Structure {

    public boolean append;
    public Pointer h;
    public SDL_RWopsIOBuffer buffer;
}
