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

public final class ActivityInDay6Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button button47;

  @NonNull
  public final Button button48;

  @NonNull
  public final Button button49;

  @NonNull
  public final Button button50;

  @NonNull
  public final Button button51;

  @NonNull
  public final ImageView imageViewinDay1;

  @NonNull
  public final LinearLayout main;

  private ActivityInDay6Binding(@NonNull LinearLayout rootView, @NonNull Button button47,
      @NonNull Button button48, @NonNull Button button49, @NonNull Button button50,
      @NonNull Button button51, @NonNull ImageView imageViewinDay1, @NonNull LinearLayout main) {
    this.rootView = rootView;
    this.button47 = button47;
    this.button48 = button48;
    this.button49 = button49;
    this.button50 = button50;
    this.button51 = button51;
    this.imageViewinDay1 = imageViewinDay1;
    this.main = main;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInDay6Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInDay6Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_in_day6, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInDay6Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button47;
      Button button47 = ViewBindings.findChildViewById(rootView, id);
      if (button47 == null) {
        break missingId;
      }

      id = R.id.button48;
      Button button48 = ViewBindings.findChildViewById(rootView, id);
      if (button48 == null) {
        break missingId;
      }

      id = R.id.button49;
      Button button49 = ViewBindings.findChildViewById(rootView, id);
      if (button49 == null) {
        break missingId;
      }

      id = R.id.button50;
      Button button50 = ViewBindings.findChildViewById(rootView, id);
      if (button50 == null) {
        break missingId;
      }

      id = R.id.button51;
      Button button51 = ViewBindings.findChildViewById(rootView, id);
      if (button51 == null) {
        break missingId;
      }

      id = R.id.imageViewinDay1;
      ImageView imageViewinDay1 = ViewBindings.findChildViewById(rootView, id);
      if (imageViewinDay1 == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      return new ActivityInDay6Binding((LinearLayout) rootView, button47, button48, button49,
          button50, button51, imageViewinDay1, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}