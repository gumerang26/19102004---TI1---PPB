// Generated by view binder compiler. Do not edit!
package com.dimas_19102004.praktikum11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnDashboardQuote;

  @NonNull
  public final Button btnEmailVerify;

  @NonNull
  public final Button btnSignOut;

  @NonNull
  public final ImageView ivImage;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvUserId;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnDashboardQuote,
      @NonNull Button btnEmailVerify, @NonNull Button btnSignOut, @NonNull ImageView ivImage,
      @NonNull TextView tvName, @NonNull TextView tvUserId) {
    this.rootView = rootView;
    this.btnDashboardQuote = btnDashboardQuote;
    this.btnEmailVerify = btnEmailVerify;
    this.btnSignOut = btnSignOut;
    this.ivImage = ivImage;
    this.tvName = tvName;
    this.tvUserId = tvUserId;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDashboardQuote;
      Button btnDashboardQuote = ViewBindings.findChildViewById(rootView, id);
      if (btnDashboardQuote == null) {
        break missingId;
      }

      id = R.id.btnEmailVerify;
      Button btnEmailVerify = ViewBindings.findChildViewById(rootView, id);
      if (btnEmailVerify == null) {
        break missingId;
      }

      id = R.id.btnSignOut;
      Button btnSignOut = ViewBindings.findChildViewById(rootView, id);
      if (btnSignOut == null) {
        break missingId;
      }

      id = R.id.ivImage;
      ImageView ivImage = ViewBindings.findChildViewById(rootView, id);
      if (ivImage == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvUserId;
      TextView tvUserId = ViewBindings.findChildViewById(rootView, id);
      if (tvUserId == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnDashboardQuote, btnEmailVerify,
          btnSignOut, ivImage, tvName, tvUserId);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
