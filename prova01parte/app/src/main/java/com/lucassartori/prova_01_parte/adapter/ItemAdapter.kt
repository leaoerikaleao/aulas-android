package com.lucassartori.prova_01_parte.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.lucassartori.prova_01_parte.R
import com.lucassartori.prova_01_parte.model.Product


data class ItemAdapter(val activity: Activity, val listProducts: List<Product>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = activity.layoutInflater.inflate(R.layout.adapter_items_list, parent, false)
        val product = listProducts[position]
        val name = view.findViewById(R.id.name) as TextView
        val description = view.findViewById(R.id.description) as TextView
        val unity = view.findViewById(R.id.unity) as TextView
        val perishable = view.findViewById(R.id.perishable) as TextView
        val canPromotion = view.findViewById(R.id.canPromotion) as TextView
        val limitStock = view.findViewById(R.id.limitStock) as TextView
        val canRefrigerateLocale = view.findViewById(R.id.canRefrigerateLocale) as TextView

        name.text = product.name
        description.text = product.description
        unity.text = product.unity
        limitStock.text = product.limitStock.toString()
        perishable.text = this.convertBoolean(product.perishable)
        canPromotion.text = this.convertBoolean(product.canPromotion)
        canRefrigerateLocale.text = this.convertBoolean(product.canRefrigerateLocale)
        return view
    }

    override fun getItem(position: Int): Any {
        return this.listProducts[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return this.listProducts.size
    }

    private fun convertBoolean(v: Boolean): String {
        return if (v)
            "SIM"
        else "NÃO"
    }
}