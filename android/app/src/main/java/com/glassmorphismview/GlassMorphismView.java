package com.glassmorphismview;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.image.ReactImageView;

class GlassMorphismView extends SimpleViewManager<ReactImageView> {

   public static final String REACT_CLASS = "GlassMorphismView";
   ReactApplicationContext CallerContext;

   public GlassMorphismView(ReactApplicationContext context){
      CallerContext = context;
   }

   @NonNull
   @Override
   public String getName() {
      return REACT_CLASS;
   }

   @NonNull
   @Override
   protected ReactImageView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
      return null;
   }
}
