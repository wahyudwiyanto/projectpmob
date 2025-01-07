// Generated by view binder compiler. Do not edit!
package com.example.coba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.coba.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPengingatBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button continueButton;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final RadioButton noReminderRadio;

  @NonNull
  public final TextView reminderDescription;

  @NonNull
  public final TimePicker timePicker;

  private ActivityPengingatBinding(@NonNull LinearLayout rootView, @NonNull Button continueButton,
      @NonNull LinearLayout main, @NonNull RadioButton noReminderRadio,
      @NonNull TextView reminderDescription, @NonNull TimePicker timePicker) {
    this.rootView = rootView;
    this.continueButton = continueButton;
    this.main = main;
    this.noReminderRadio = noReminderRadio;
    this.reminderDescription = reminderDescription;
    this.timePicker = timePicker;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPengingatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPengingatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pengingat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPengingatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continueButton;
      Button continueButton = ViewBindings.findChildViewById(rootView, id);
      if (continueButton == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.noReminderRadio;
      RadioButton noReminderRadio = ViewBindings.findChildViewById(rootView, id);
      if (noReminderRadio == null) {
        break missingId;
      }

      id = R.id.reminderDescription;
      TextView reminderDescription = ViewBindings.findChildViewById(rootView, id);
      if (reminderDescription == null) {
        break missingId;
      }

      id = R.id.timePicker;
      TimePicker timePicker = ViewBindings.findChildViewById(rootView, id);
      if (timePicker == null) {
        break missingId;
      }

      return new ActivityPengingatBinding((LinearLayout) rootView, continueButton, main,
          noReminderRadio, reminderDescription, timePicker);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}