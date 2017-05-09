package com.necistudio.appjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.necistudio.appjava.adapter.UserAdapter;
import com.necistudio.appjava.item.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycleView);
        ArrayList<User> items = new ArrayList<>();
        int a = 10;
        while (a>0){
            Log.e("data","data");
            User user = new User();
            user.setTitle("Test1");
            user.setImgData("http://cdn0-a.production.liputan6.static6.com/medias/933932/big/055110800_1437567577-Jessica_Mila-9.jpg");
            items.add(user);
            a--;
        }
        UserAdapter adapter = new UserAdapter(this,items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
