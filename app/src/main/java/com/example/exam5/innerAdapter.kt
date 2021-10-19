package com.example.exam5

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class innerAdapter(val items:ArrayList<FieldsSubListItem>):RecyclerView.Adapter<innerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Et.hint = items[position].hint
        holder.Et.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d( "inputtext", "${holder.Et.text.toString()}")
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })
    }

    override fun getItemCount() = items.size
    inner class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val Et = view.findViewById<EditText>(R.id.ET_inner)

    }


}