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

public final class ActivityHalamanutamaBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button button14;

  @NonNull
  public final Button button15;

  @NonNull
  public final Button button16;

  @NonNull
  public final Button button17;

  @NonNull
  public final Button button18;

  @NonNull
  public final Button button199;

  @NonNull
  public final TextView hari1Duration;

  @NonNull
  public final TextView hari1Title;

  @NonNull
  public final TextView hari7Duration;

  @NonNull
  public final TextView hari7Title;

  @NonNull
  public final ImageView imageView9;

  private ActivityHalamanutamaBinding(@NonNull LinearLayout rootView, @NonNull Button button14,
      @NonNull Button button15, @NonNull Button button16, @NonNull Button button17,
      @NonNull Button button18, @NonNull Button button199, @NonNull TextView hari1Duration,
      @NonNull TextView hari1Title, @NonNull TextView hari7Duration, @NonNull TextView hari7Title,
      @NonNull ImageView imageView9) {
    this.rootView = rootView;
    this.button14 = button14;
    this.button15 = button15;
    this.button16 = button16;
    this.button17 = button17;
    this.button18 = button18;
    this.button199 = button199;
    this.hari1Duration = hari1Duration;
    this.hari1Title = hari1Title;
    this.hari7Duration = hari7Duration;
    this.hari7Title = hari7Title;
    this.imageView9 = imageView9;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHalamanutamaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHalamanutamaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_halamanutama, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHalamanutamaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button14;
      Button button14 = ViewBindings.findChildViewById(rootView, id);
      if (button14 == null) {
        break missingId;
      }

      id = R.id.button15;
      Button button15 = ViewBindings.findChildViewById(rootView, id);
      if (button15 == null) {
        break missingId;
      }

      id = R.id.button16;
      Button button16 = ViewBindings.findChildViewById(rootView, id);
      if (button16 == null) {
        break missingId;
      }

      id = R.id.button17;
      Button button17 = ViewBindings.findChildViewById(rootView, id);
      if (button17 == null) {
        break missingId;
      }

      id = R.id.button18;
      Button button18 = ViewBindings.findChildViewById(rootView, id);
      if (button18 == null) {
        break missingId;
      }

      id = R.id.button199;
      Button button199 = ViewBindings.findChildViewById(rootView, id);
      if (button199 == null) {
        break missingId;
      }

      id = R.id.hari1_duration;
      TextView hari1Duration = ViewBindings.findChildViewById(rootView, id);
      if (hari1Duration == null) {
        break missingId;
      }

      id = R.id.hari1_title;
      TextView hari1Title = ViewBindings.findChildViewById(rootView, id);
      if (hari1Title == null) {
        break missingId;
      }

      id = R.id.hari7_duration;
      TextView hari7Duration = ViewBindings.findChildViewById(rootView, id);
      if (hari7Duration == null) {
        break missingId;
      }

      id = R.id.hari7_title;
      TextView hari7Title = ViewBindings.findChildViewById(rootView, id);
      if (hari7Title == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      return new ActivityHalamanutamaBinding((LinearLayout) rootView, button14, button15, button16,
          button17, button18, button199, hari1Duration, hari1Title, hari7Duration, hari7Title,
          imageView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}