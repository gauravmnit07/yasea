package com.seu.magicfilter.utils;

import com.seu.magicfilter.base.GPUImageFilter;

public class MagicFilterFactory {

    public static GPUImageFilter initFilters(MagicFilterType type) {
        switch (type) {
            case NONE:
                return new GPUImageFilter();
            default:
                return null;
        }
    }
}
