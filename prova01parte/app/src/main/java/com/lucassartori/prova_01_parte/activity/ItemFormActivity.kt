package com.lucassartori.prova_01_parte.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Spinner
import com.lucassartori.prova_01_parte.R
import com.lucassartori.prova_01_parte.adapter.SpinnerAdapter
import com.lucassartori.prova_01_parte.model.Product
import com.lucassartori.prova_01_parte.util.AlertMessage
import kotlinx.android.synthetic.main.activity_item_register.*


class ItemFormActivity : AppCompatActivity() {
    lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_register)

        val spinnerAdapter = SpinnerAdapter(this.spinerPopulate(), this)
        this.spinner = this.unity as Spinner
        this.spinner.adapter = spinnerAdapter
    }


    fun save(view: View) {
        if (isEmpty())
            AlertMessage.warning(this, "Atençao, tem campos que precisao ser preenchidos")
        else {
            val product =
                    Product(
                            this.name.text.toString(),
                            this.description.text.toString(),
                            this.unity.toString(),
                            this.perishable.isActivated,
                            this.canPromotion.isActivated,
                            this.limitStock.text.toString().toInt(),
                            this.canRefrigerateLocale.isActivated)
            AlertMessage.success(this, "Salvo com sucesso")
            val intent = Intent(this, ItemActivity::class.java)
            intent.putExtra("product", product)
            startActivity(intent)
        }
    }

    private fun isEmpty(): Boolean {
        return this.name.text.isEmpty() || this.description.text.isEmpty() || this.limitStock.text.isEmpty()
    }

    private fun spinerPopulate(): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()
        list.add("Unidade")
        list.add("Litro")
        list.add("Lata")
        list.add("kiLO")
        return list
    }
}
