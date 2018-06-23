package com.lucassartori.prova_01_parte.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lucassartori.prova_01_parte.R
import com.lucassartori.prova_01_parte.adapter.ItemAdapter
import com.lucassartori.prova_01_parte.model.Product
import kotlinx.android.synthetic.main.activity_item.*

class ItemActivity : AppCompatActivity() {
    val list = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)
        val intent = Intent(this, ItemActivity::class.java)
        val product: Product = getIntent().extras.getSerializable("product") as Product
        this.list.add(product)
        val itemAdapter = ItemAdapter(this, this.mountItens())
        this.list_item.adapter = itemAdapter
    }

    private fun mountItens(): ArrayList<Product> {
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        this.list.add(Product("Tapioca", "loco de bao", "unidade", true, true, 0, false))
        return this.list
    }
}