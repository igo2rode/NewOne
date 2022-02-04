package com.igor.oop.planes;

public interface AirplaneCargo extends Airplane{
    void load();

    void unload ();

    static AirplaneCargo create() {
        return new KawasakiС2("KawasakiC2");
    }
}
