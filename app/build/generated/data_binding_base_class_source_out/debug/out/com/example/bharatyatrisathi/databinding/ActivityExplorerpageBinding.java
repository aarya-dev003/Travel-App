// Generated by view binder compiler. Do not edit!
package com.example.bharatyatrisathi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bharatyatrisathi.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExplorerpageBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView categories;

  @NonNull
  public final LinearLayout explore1;

  @NonNull
  public final LinearLayout explore2;

  @NonNull
  public final LinearLayout explore3;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final BottomNavigationView navigationDrawer;

  @NonNull
  public final LinearLayout relView1;

  @NonNull
  public final LinearLayout relView2;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView5;

  private ActivityExplorerpageBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView categories, @NonNull LinearLayout explore1, @NonNull LinearLayout explore2,
      @NonNull LinearLayout explore3, @NonNull ImageView imageView, @NonNull ImageView imageView11,
      @NonNull ImageView imageView5, @NonNull ImageView imageView6,
      @NonNull BottomNavigationView navigationDrawer, @NonNull LinearLayout relView1,
      @NonNull LinearLayout relView2, @NonNull TextView textView15, @NonNull TextView textView2,
      @NonNull TextView textView3, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.categories = categories;
    this.explore1 = explore1;
    this.explore2 = explore2;
    this.explore3 = explore3;
    this.imageView = imageView;
    this.imageView11 = imageView11;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.navigationDrawer = navigationDrawer;
    this.relView1 = relView1;
    this.relView2 = relView2;
    this.textView15 = textView15;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExplorerpageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExplorerpageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_explorerpage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExplorerpageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.categories;
      TextView categories = ViewBindings.findChildViewById(rootView, id);
      if (categories == null) {
        break missingId;
      }

      id = R.id.explore1;
      LinearLayout explore1 = ViewBindings.findChildViewById(rootView, id);
      if (explore1 == null) {
        break missingId;
      }

      id = R.id.explore2;
      LinearLayout explore2 = ViewBindings.findChildViewById(rootView, id);
      if (explore2 == null) {
        break missingId;
      }

      id = R.id.explore3;
      LinearLayout explore3 = ViewBindings.findChildViewById(rootView, id);
      if (explore3 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView11;
      ImageView imageView11 = ViewBindings.findChildViewById(rootView, id);
      if (imageView11 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.navigation_drawer;
      BottomNavigationView navigationDrawer = ViewBindings.findChildViewById(rootView, id);
      if (navigationDrawer == null) {
        break missingId;
      }

      id = R.id.relView1;
      LinearLayout relView1 = ViewBindings.findChildViewById(rootView, id);
      if (relView1 == null) {
        break missingId;
      }

      id = R.id.relView2;
      LinearLayout relView2 = ViewBindings.findChildViewById(rootView, id);
      if (relView2 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new ActivityExplorerpageBinding((RelativeLayout) rootView, categories, explore1,
          explore2, explore3, imageView, imageView11, imageView5, imageView6, navigationDrawer,
          relView1, relView2, textView15, textView2, textView3, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
