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

public final class ActivityMulaiDay5Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView hari5;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final TextView plank;

  @NonNull
  public final Button startButton5;

  @NonNull
  public final TextView timerTextView5;

  @NonNull
  public final TextView titleQuestion5;

  private ActivityMulaiDay5Binding(@NonNull LinearLayout rootView, @NonNull TextView hari5,
      @NonNull ImageView imageView5, @NonNull TextView plank, @NonNull Button startButton5,
      @NonNull TextView timerTextView5, @NonNull TextView titleQuestion5) {
    this.rootView = rootView;
    this.hari5 = hari5;
    this.imageView5 = imageView5;
    this.plank = plank;
    this.startButton5 = startButton5;
    this.timerTextView5 = timerTextView5;
    this.titleQuestion5 = titleQuestion5;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMulaiDay5Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMulaiDay5Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_mulai_day5, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMulaiDay5Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.hari5;
      TextView hari5 = ViewBindings.findChildViewById(rootView, id);
      if (hari5 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.plank;
      TextView plank = ViewBindings.findChildViewById(rootView, id);
      if (plank == null) {
        break missingId;
      }

      id = R.id.startButton5;
      Button startButton5 = ViewBindings.findChildViewById(rootView, id);
      if (startButton5 == null) {
        break missingId;
      }

      id = R.id.timerTextView5;
      TextView timerTextView5 = ViewBindings.findChildViewById(rootView, id);
      if (timerTextView5 == null) {
        break missingId;
      }

      id = R.id.title_question5;
      TextView titleQuestion5 = ViewBindings.findChildViewById(rootView, id);
      if (titleQuestion5 == null) {
        break missingId;
      }

      return new ActivityMulaiDay5Binding((LinearLayout) rootView, hari5, imageView5, plank,
          startButton5, timerTextView5, titleQuestion5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
