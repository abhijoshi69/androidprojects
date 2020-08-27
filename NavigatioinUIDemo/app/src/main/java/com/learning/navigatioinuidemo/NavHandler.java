package com.learning.navigatioinuidemo;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

class NavHandler
{
    public void handleNavigation(View view, Button btnfourth, final int resID)
    {
        final NavController controller = Navigation.findNavController(view);
        btnfourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.navigate(resID);
            }
        });
    }
}
