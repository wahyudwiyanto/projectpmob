// Generated by view binder compiler. Do not edit!
package com.example.coba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.coba.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInDay5Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button button42;

  @NonNull
  public final Button button43;

  @NonNull
  public final Button button44;

  @NonNull
  public final Button button45;

  @NonNull
  public final Button button46;

  @NonNull
  public final ImageView imageViewinDay1;

  @NonNull
  public final LinearLayout main;

  private ActivityInDay5Binding(@NonNull LinearLayout rootView, @NonNull Button button42,
      @NonNull Button button43, @NonNull Button button44, @NonNull Button button45,
      @NonNull Button button46, @NonNull ImageView imageViewinDay1, @NonNull LinearLayout main) {
    this.rootView = rootView;
    this.button42 = button42;
    this.button43 = button43;
    this.button44 = button44;
    this.button45 = button45;
    this.button46 = button46;
    this.imageViewinDay1 = imageViewinDay1;
    this.main = main;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInDay5Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInDay5Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_in_day5, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInDay5Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button42;
      Button button42 = ViewBindings.findChildViewById(rootView, id);
      if (button42 == null) {
        break missingId;
      }

      id = R.id.button43;
      Button button43 = ViewBindings.findChildViewById(rootView, id);
      if (button43 == null) {
        break missingId;
      }

      id = R.id.button44;
      Button button44 = ViewBindings.findChildViewById(rootView, id);
      if (button44 == null) {
        break missingId;
      }

      id = R.id.button45;
      Button button45 = ViewBindings.findChildViewById(rootView, id);
      if (button45 == null) {
        break missingId;
      }

      id = R.id.button46;
      Button button46 = ViewBindings.findChildViewById(rootView, id);
      if (button46 == null) {
        break missingId;
      }

      id = R.id.imageViewinDay1;
      ImageView imageViewinDay1 = ViewBindings.findChildViewById(rootView, id);
      if (imageViewinDay1 == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      return new ActivityInDay5Binding((LinearLayout) rootView, button42, button43, button44,
          button45, button46, imageViewinDay1, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}