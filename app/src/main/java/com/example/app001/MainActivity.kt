package com.example.app001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app001.data.PersonListAdapter
import com.example.app001.model.Person

class MainActivity : AppCompatActivity() {

     private var adapter: PersonListAdapter? = null
     private var personList: ArrayList<Person>? = null
     private var layoutManager : RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instantiate recycler view
        var recyclerview:RecyclerView = findViewById(R.id.recyclerViewpanel)

        personList = ArrayList<Person>()
        adapter = PersonListAdapter(personList!!, this)
        layoutManager = LinearLayoutManager(this)


        //setup our recycler view

        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = adapter

        //load data
        for (i in 0..16){
            val person = Person()
            person.name = "Ted " + i
            person.age = 20 + i
            personList!!.add(person)

        }

        adapter!!.notifyDataSetChanged()





    }
}