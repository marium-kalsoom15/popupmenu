package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Showpopup(View v)
    {
        PopupMenu popupMenu=new PopupMenu(this,v);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menu);
        popupMenu.show();
    }
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())

        {
            case R.id.item1:
                Toast.makeText(this,"ITEM 1 IS CLICKED",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"ITEM 2 IS CLICKED",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"ITEM 3 IS CLICKED",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this,"ITEM 4 IS CLICKED",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }

    }
}
