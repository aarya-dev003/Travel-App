// Generated by view binder compiler. Do not edit!
package com.example.bharatyatrisathi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bharatyatrisathi.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button edit;

  @NonNull
  public final TextView email;

  @NonNull
  public final ImageButton message;

  @NonNull
  public final TextView nametv;

  @NonNull
  public final BottomNavigationView navigationDrawer;

  @NonNull
  public final MaterialCardView navigationDrawerCard;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final RelativeLayout profileLayout;

  @NonNull
  public final RelativeLayout profileRl;

  @NonNull
  public final ImageButton setting;

  private ActivityProfileBinding(@NonNull RelativeLayout rootView, @NonNull Button edit,
      @NonNull TextView email, @NonNull ImageButton message, @NonNull TextView nametv,
      @NonNull BottomNavigationView navigationDrawer,
      @NonNull MaterialCardView navigationDrawerCard, @NonNull CircleImageView profileImage,
      @NonNull RelativeLayout profileLayout, @NonNull RelativeLayout profileRl,
      @NonNull ImageButton setting) {
    this.rootView = rootView;
    this.edit = edit;
    this.email = email;
    this.message = message;
    this.nametv = nametv;
    this.navigationDrawer = navigationDrawer;
    this.navigationDrawerCard = navigationDrawerCard;
    this.profileImage = profileImage;
    this.profileLayout = profileLayout;
    this.profileRl = profileRl;
    this.setting = setting;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile_, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edit;
      Button edit = ViewBindings.findChildViewById(rootView, id);
      if (edit == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.message;
      ImageButton message = ViewBindings.findChildViewById(rootView, id);
      if (message == null) {
        break missingId;
      }

      id = R.id.nametv;
      TextView nametv = ViewBindings.findChildViewById(rootView, id);
      if (nametv == null) {
        break missingId;
      }

      id = R.id.navigation_drawer;
      BottomNavigationView navigationDrawer = ViewBindings.findChildViewById(rootView, id);
      if (navigationDrawer == null) {
        break missingId;
      }

      id = R.id.navigation_drawer_card;
      MaterialCardView navigationDrawerCard = ViewBindings.findChildViewById(rootView, id);
      if (navigationDrawerCard == null) {
        break missingId;
      }

      id = R.id.profileImage;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.profileLayout;
      RelativeLayout profileLayout = ViewBindings.findChildViewById(rootView, id);
      if (profileLayout == null) {
        break missingId;
      }

      id = R.id.profileRl;
      RelativeLayout profileRl = ViewBindings.findChildViewById(rootView, id);
      if (profileRl == null) {
        break missingId;
      }

      id = R.id.setting;
      ImageButton setting = ViewBindings.findChildViewById(rootView, id);
      if (setting == null) {
        break missingId;
      }

      return new ActivityProfileBinding((RelativeLayout) rootView, edit, email, message, nametv,
          navigationDrawer, navigationDrawerCard, profileImage, profileLayout, profileRl, setting);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
