package com.seu.magicfilter.utils;


import com.seu.magicfilter.base.gpuimage.GPUImageFilter;

public class MagicFilterFactory {

    public static GPUImageFilter initFilters(MagicFilterType type) {
        switch (type) {
            case NONE:
            default:
                return new GPUImageFilter();
        }
    }
}
