// Generated by view binder compiler. Do not edit!
package com.example.coba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.coba.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMulaiDay4Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView hari4;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView skipping;

  @NonNull
  public final Button startButton4;

  @NonNull
  public final TextView timerTextView4;

  @NonNull
  public final TextView titleQuestion4;

  private ActivityMulaiDay4Binding(@NonNull LinearLayout rootView, @NonNull TextView hari4,
      @NonNull ImageView imageView4, @NonNull TextView skipping, @NonNull Button startButton4,
      @NonNull TextView timerTextView4, @NonNull TextView titleQuestion4) {
    this.rootView = rootView;
    this.hari4 = hari4;
    this.imageView4 = imageView4;
    this.skipping = skipping;
    this.startButton4 = startButton4;
    this.timerTextView4 = timerTextView4;
    this.titleQuestion4 = titleQuestion4;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMulaiDay4Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMulaiDay4Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_mulai_day4, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMulaiDay4Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.hari4;
      TextView hari4 = ViewBindings.findChildViewById(rootView, id);
      if (hari4 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.skipping;
      TextView skipping = ViewBindings.findChildViewById(rootView, id);
      if (skipping == null) {
        break missingId;
      }

      id = R.id.startButton4;
      Button startButton4 = ViewBindings.findChildViewById(rootView, id);
      if (startButton4 == null) {
        break missingId;
      }

      id = R.id.timerTextView4;
      TextView timerTextView4 = ViewBindings.findChildViewById(rootView, id);
      if (timerTextView4 == null) {
        break missingId;
      }

      id = R.id.title_question4;
      TextView titleQuestion4 = ViewBindings.findChildViewById(rootView, id);
      if (titleQuestion4 == null) {
        break missingId;
      }

      return new ActivityMulaiDay4Binding((LinearLayout) rootView, hari4, imageView4, skipping,
          startButton4, timerTextView4, titleQuestion4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
