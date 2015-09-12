package com.droidcon.uk.physicsui;

import android.content.Context;
import android.support.annotation.NonNull;

import com.droidcon.uk.physicsui.slides.title.SlideTitle;
import com.droidcon.uk.physicsui.slides.title.SlideWhySprings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabrantes on 08/09/2015.
 */
public class DroidconUkPresentation implements Presentation {

    @NonNull List<Slide> mSlides;

    public DroidconUkPresentation(@NonNull Context context) {
        mSlides = new ArrayList<>();
        mSlides.add(new SlideTitle(context, R.layout.slide_title));
        mSlides.add(new SlideWhySprings(context, R.layout.slide_why_springs));
    }

    @Override
    public int slideCount() {
        return mSlides.size();
    }

    @NonNull
    @Override
    public Slide getSlide(int index) {
        return index < 0 || index >= mSlides.size() ? Slide.NONE : mSlides.get(index);
    }
}
