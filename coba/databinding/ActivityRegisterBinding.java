// Generated by view binder compiler. Do not edit!
package com.example.coba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button button13;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final EditText passwordEditTextregis;

  @NonNull
  public final ImageView showPasswordIcon;

  @NonNull
  public final ImageView showPasswordIconregis;

  @NonNull
  public final EditText usernameEditText;

  private ActivityRegisterBinding(@NonNull LinearLayout rootView, @NonNull Button button13,
      @NonNull ImageView imageView6, @NonNull LinearLayout main, @NonNull EditText passwordEditText,
      @NonNull EditText passwordEditTextregis, @NonNull ImageView showPasswordIcon,
      @NonNull ImageView showPasswordIconregis, @NonNull EditText usernameEditText) {
    this.rootView = rootView;
    this.button13 = button13;
    this.imageView6 = imageView6;
    this.main = main;
    this.passwordEditText = passwordEditText;
    this.passwordEditTextregis = passwordEditTextregis;
    this.showPasswordIcon = showPasswordIcon;
    this.showPasswordIconregis = showPasswordIconregis;
    this.usernameEditText = usernameEditText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button13;
      Button button13 = ViewBindings.findChildViewById(rootView, id);
      if (button13 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.passwordEditText;
      EditText passwordEditText = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditText == null) {
        break missingId;
      }

      id = R.id.passwordEditTextregis;
      EditText passwordEditTextregis = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditTextregis == null) {
        break missingId;
      }

      id = R.id.showPasswordIcon;
      ImageView showPasswordIcon = ViewBindings.findChildViewById(rootView, id);
      if (showPasswordIcon == null) {
        break missingId;
      }

      id = R.id.showPasswordIconregis;
      ImageView showPasswordIconregis = ViewBindings.findChildViewById(rootView, id);
      if (showPasswordIconregis == null) {
        break missingId;
      }

      id = R.id.usernameEditText;
      EditText usernameEditText = ViewBindings.findChildViewById(rootView, id);
      if (usernameEditText == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((LinearLayout) rootView, button13, imageView6, main,
          passwordEditText, passwordEditTextregis, showPasswordIcon, showPasswordIconregis,
          usernameEditText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}