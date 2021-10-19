package com.example.exam5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OuterAdapter(private val items:ArrayList<FieldsSubList>):RecyclerView.Adapter<OuterAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.inner_rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initInnerRV(items[position])
    }

    override fun getItemCount()= items.size

    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val innerRv = view.findViewById<RecyclerView>(R.id.RV_inner)
        val context = view.context
        fun initInnerRV( innerRvItem:ArrayList<FieldsSubListItem>){
            innerRv.adapter = innerAdapter(innerRvItem)
            innerRv.layoutManager = LinearLayoutManager(context)
        }
    }

}