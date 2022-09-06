package com.example.app001.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app001.R
import com.example.app001.model.Person

class PersonListAdapter (private val list: ArrayList<Person>,
                         private val context:Context) : RecyclerView.Adapter<PersonListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(person: Person) {
            var name: TextView = itemView.findViewById(R.id.txtName) as TextView
            var age: TextView = itemView.findViewById(R.id.txtAge) as TextView

            name.text = person.name
            age.text = person.age.toString()


        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonListAdapter.ViewHolder {
        //create view from xml
        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: PersonListAdapter.ViewHolder, position: Int) {

        holder.bindItem(list[position])
    }

    override fun getItemCount(): Int {

        return list.size
    }
}