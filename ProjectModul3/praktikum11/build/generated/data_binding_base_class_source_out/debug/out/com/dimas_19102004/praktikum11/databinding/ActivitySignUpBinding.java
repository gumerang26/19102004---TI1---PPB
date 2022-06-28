// Generated by view binder compiler. Do not edit!
package com.dimas_19102004.praktikum11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dimas_19102004.praktikum11.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCreateAccount;

  @NonNull
  public final EditText inputEmail;

  @NonNull
  public final EditText inputPassword;

  @NonNull
  public final ImageView ivIcon;

  @NonNull
  public final TextView tvCreateAccount;

  private ActivitySignUpBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnCreateAccount, @NonNull EditText inputEmail,
      @NonNull EditText inputPassword, @NonNull ImageView ivIcon,
      @NonNull TextView tvCreateAccount) {
    this.rootView = rootView;
    this.btnCreateAccount = btnCreateAccount;
    this.inputEmail = inputEmail;
    this.inputPassword = inputPassword;
    this.ivIcon = ivIcon;
    this.tvCreateAccount = tvCreateAccount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCreateAccount;
      Button btnCreateAccount = ViewBindings.findChildViewById(rootView, id);
      if (btnCreateAccount == null) {
        break missingId;
      }

      id = R.id.inputEmail;
      EditText inputEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputEmail == null) {
        break missingId;
      }

      id = R.id.inputPassword;
      EditText inputPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.ivIcon;
      ImageView ivIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivIcon == null) {
        break missingId;
      }

      id = R.id.tvCreateAccount;
      TextView tvCreateAccount = ViewBindings.findChildViewById(rootView, id);
      if (tvCreateAccount == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ConstraintLayout) rootView, btnCreateAccount, inputEmail,
          inputPassword, ivIcon, tvCreateAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
