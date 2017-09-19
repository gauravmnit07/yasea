package com.seu.magicfilter.utils;


import com.seu.magicfilter.base.MagicLookupFilter;
import com.seu.magicfilter.base.gpuimage.GPUImageBrightnessFilter;
import com.seu.magicfilter.base.gpuimage.GPUImageContrastFilter;
import com.seu.magicfilter.base.gpuimage.GPUImageExposureFilter;
import com.seu.magicfilter.base.gpuimage.GPUImageFilter;
import com.seu.magicfilter.base.gpuimage.GPUImageHueFilter;
import com.seu.magicfilter.base.gpuimage.GPUImageSaturationFilter;
import com.seu.magicfilter.base.gpuimage.GPUImageSharpenFilter;

public class MagicFilterFactory {

    public static GPUImageFilter initFilters(MagicFilterType type) {
        switch (type) {
            case NONE:
                return new GPUImageFilter();
            case LOCKUP:
                return new MagicLookupFilter("");
            //image adjust
            case BRIGHTNESS:
                return new GPUImageBrightnessFilter();
            case CONTRAST:
                return new GPUImageContrastFilter();
            case EXPOSURE:
                return new GPUImageExposureFilter();
            case HUE:
                return new GPUImageHueFilter();
            case SATURATION:
                return new GPUImageSaturationFilter();
            case SHARPEN:
                return new GPUImageSharpenFilter();
            default:
                return null;
        }
    }
}
