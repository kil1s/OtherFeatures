package com.github.kil1s.other.feature;

public class Features<T extends Enum> {
    protected T[] features = null;

    public Features(T... features) {
        this.features = features;
    }

    public boolean got(T feature) {
        if (features == null) {
            return false;
        }

        for (T gotFeature:features) {
            if (gotFeature == feature) {
                return true;
            }
        }

        return false;
    }
}
