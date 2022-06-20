// Generated by view binder compiler. Do not edit!
package com.dimas_19102004.praktikum10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dimas_19102004.praktikum10.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityQuoteAddUpdateBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final Spinner edtCategory;

  @NonNull
  public final EditText edtDescription;

  @NonNull
  public final EditText edtTitle;

  @NonNull
  public final TextView tvCateogry;

  private ActivityQuoteAddUpdateBinding(@NonNull LinearLayout rootView, @NonNull Button btnSubmit,
      @NonNull Spinner edtCategory, @NonNull EditText edtDescription, @NonNull EditText edtTitle,
      @NonNull TextView tvCateogry) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.edtCategory = edtCategory;
    this.edtDescription = edtDescription;
    this.edtTitle = edtTitle;
    this.tvCateogry = tvCateogry;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityQuoteAddUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityQuoteAddUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_quote_add_update, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityQuoteAddUpdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_submit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.edt_category;
      Spinner edtCategory = ViewBindings.findChildViewById(rootView, id);
      if (edtCategory == null) {
        break missingId;
      }

      id = R.id.edt_description;
      EditText edtDescription = ViewBindings.findChildViewById(rootView, id);
      if (edtDescription == null) {
        break missingId;
      }

      id = R.id.edt_title;
      EditText edtTitle = ViewBindings.findChildViewById(rootView, id);
      if (edtTitle == null) {
        break missingId;
      }

      id = R.id.tv_cateogry;
      TextView tvCateogry = ViewBindings.findChildViewById(rootView, id);
      if (tvCateogry == null) {
        break missingId;
      }

      return new ActivityQuoteAddUpdateBinding((LinearLayout) rootView, btnSubmit, edtCategory,
          edtDescription, edtTitle, tvCateogry);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
