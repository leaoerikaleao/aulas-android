package com.lucassartori.prova_01_parte.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.lucassartori.prova_01_parte.R

data class SpinnerAdapter(val listItens: ArrayList<String>, val activity: Activity) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = activity.layoutInflater.inflate(R.layout.adapter_spinner, parent, false)
        val product = listItens[position]
        val name = view.findViewById(R.id.name) as TextView

        name.text = product

        return view
    }

    override fun getItem(position: Int): Any {
        return this.listItens[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return this.listItens.size
    }
}