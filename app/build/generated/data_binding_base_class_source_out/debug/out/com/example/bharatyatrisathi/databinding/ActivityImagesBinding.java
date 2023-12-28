// Generated by view binder compiler. Do not edit!
package com.example.bharatyatrisathi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bharatyatrisathi.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityImagesBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final BottomNavigationView navigationDrawer;

  @NonNull
  public final MaterialCardView navigationDrawerCard;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView textView2;

  private ActivityImagesBinding(@NonNull RelativeLayout rootView,
      @NonNull BottomNavigationView navigationDrawer,
      @NonNull MaterialCardView navigationDrawerCard, @NonNull RecyclerView recyclerView,
      @NonNull TextView textView2) {
    this.rootView = rootView;
    this.navigationDrawer = navigationDrawer;
    this.navigationDrawerCard = navigationDrawerCard;
    this.recyclerView = recyclerView;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityImagesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityImagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_images, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityImagesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
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

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityImagesBinding((RelativeLayout) rootView, navigationDrawer,
          navigationDrawerCard, recyclerView, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
