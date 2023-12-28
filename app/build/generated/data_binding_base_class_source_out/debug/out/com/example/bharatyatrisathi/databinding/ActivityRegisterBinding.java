// Generated by view binder compiler. Do not edit!
package com.example.bharatyatrisathi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bharatyatrisathi.R;
import com.google.android.material.textfield.TextInputEditText;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton addImage;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final TextView haveAccount;

  @NonNull
  public final RelativeLayout imagerl;

  @NonNull
  public final LinearLayout ll2;

  @NonNull
  public final TextInputEditText name;

  @NonNull
  public final TextInputEditText password;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final Button signUpBtn;

  @NonNull
  public final Button signin;

  private ActivityRegisterBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton addImage,
      @NonNull TextInputEditText email, @NonNull TextView haveAccount,
      @NonNull RelativeLayout imagerl, @NonNull LinearLayout ll2, @NonNull TextInputEditText name,
      @NonNull TextInputEditText password, @NonNull CircleImageView profileImage,
      @NonNull Button signUpBtn, @NonNull Button signin) {
    this.rootView = rootView;
    this.addImage = addImage;
    this.email = email;
    this.haveAccount = haveAccount;
    this.imagerl = imagerl;
    this.ll2 = ll2;
    this.name = name;
    this.password = password;
    this.profileImage = profileImage;
    this.signUpBtn = signUpBtn;
    this.signin = signin;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
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
      id = R.id.addImage;
      ImageButton addImage = ViewBindings.findChildViewById(rootView, id);
      if (addImage == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputEditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.haveAccount;
      TextView haveAccount = ViewBindings.findChildViewById(rootView, id);
      if (haveAccount == null) {
        break missingId;
      }

      id = R.id.imagerl;
      RelativeLayout imagerl = ViewBindings.findChildViewById(rootView, id);
      if (imagerl == null) {
        break missingId;
      }

      id = R.id.ll2;
      LinearLayout ll2 = ViewBindings.findChildViewById(rootView, id);
      if (ll2 == null) {
        break missingId;
      }

      id = R.id.name;
      TextInputEditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputEditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.profileImage;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.sign_up_btn;
      Button signUpBtn = ViewBindings.findChildViewById(rootView, id);
      if (signUpBtn == null) {
        break missingId;
      }

      id = R.id.signin;
      Button signin = ViewBindings.findChildViewById(rootView, id);
      if (signin == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((RelativeLayout) rootView, addImage, email, haveAccount,
          imagerl, ll2, name, password, profileImage, signUpBtn, signin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}