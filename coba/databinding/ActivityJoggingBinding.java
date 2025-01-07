// Generated by view binder compiler. Do not edit!
package com.example.coba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityJoggingBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView joggingInfoText;

  @NonNull
  public final Button selesai;

  @NonNull
  public final Button startStopButton;

  @NonNull
  public final Button viewDataButton;

  private ActivityJoggingBinding(@NonNull LinearLayout rootView, @NonNull TextView joggingInfoText,
      @NonNull Button selesai, @NonNull Button startStopButton, @NonNull Button viewDataButton) {
    this.rootView = rootView;
    this.joggingInfoText = joggingInfoText;
    this.selesai = selesai;
    this.startStopButton = startStopButton;
    this.viewDataButton = viewDataButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJoggingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJoggingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_jogging, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJoggingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.joggingInfoText;
      TextView joggingInfoText = ViewBindings.findChildViewById(rootView, id);
      if (joggingInfoText == null) {
        break missingId;
      }

      id = R.id.selesai;
      Button selesai = ViewBindings.findChildViewById(rootView, id);
      if (selesai == null) {
        break missingId;
      }

      id = R.id.startStopButton;
      Button startStopButton = ViewBindings.findChildViewById(rootView, id);
      if (startStopButton == null) {
        break missingId;
      }

      id = R.id.viewDataButton;
      Button viewDataButton = ViewBindings.findChildViewById(rootView, id);
      if (viewDataButton == null) {
        break missingId;
      }

      return new ActivityJoggingBinding((LinearLayout) rootView, joggingInfoText, selesai,
          startStopButton, viewDataButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
