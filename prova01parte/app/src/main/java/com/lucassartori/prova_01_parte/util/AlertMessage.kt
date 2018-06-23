package com.lucassartori.prova_01_parte.util

import android.content.Context
import cn.pedant.SweetAlert.SweetAlertDialog

class AlertMessage {
    companion object {

        fun error(context: Context, message: String) = SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE).setTitleText("Oops...").setContentText(message).show()

        fun warning(context: Context, message: String) = SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE).setTitleText("Atençao!").setContentText(message).show()

        fun success(context: Context, message: String) = SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE).setTitleText("Sucesso").setContentText(message).show()

        fun normal(context: Context, message: String) = SweetAlertDialog(context, SweetAlertDialog.NORMAL_TYPE).setTitleText("Info").setContentText(message).show()

    }
}