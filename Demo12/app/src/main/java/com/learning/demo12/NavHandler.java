package com.learning.demo12;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

class NavHandler
{
    public void handleNavigation(View view, Button btnStart, final int resID)
    {
        final NavController controller = Navigation.findNavController(view);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.navigate(resID);
            }
        });
    }
}
