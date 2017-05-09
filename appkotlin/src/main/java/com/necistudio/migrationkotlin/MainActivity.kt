package com.necistudio.migrationkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.LayoutManager
import android.util.Log
import com.necistudio.migrationkotlin.adapter.UserAdapter
import com.necistudio.migrationkotlin.item.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycleView: RecyclerView = findViewById(R.id.recycleView) as RecyclerView

        var items: ArrayList<User> = ArrayList()
        var a: Int = 10
        while (a > 0) {
            var name:String = "Text1"
            var imgData:String = "http://cdn0-a.production.liputan6.static6.com/medias/933932/big/055110800_1437567577-Jessica_Mila-9.jpg"
            var item: User = User(name,imgData)
            items.add(item)
            a--
        }

        var adapter: UserAdapter = UserAdapter(this,items)
        var layoutmanager: LinearLayoutManager = LinearLayoutManager(this)
        recycleView.setLayoutManager(layoutmanager)
        recycleView.setAdapter(adapter)

    }
}
