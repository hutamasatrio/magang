package com.example.projecttimeline.handler

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.projecttimeline.R

class DialogInputData(var context : Activity, val input : TextView) {

    private var alert : AlertDialog? = null
    private lateinit var v : View

    @SuppressLint("InflateParams")
    fun build() {
        val builder = AlertDialog.Builder(context)
        val inflater = LayoutInflater.from(context)
        v = inflater.inflate(R.layout.alert_input_data, null, false)

        onClick()

        builder.setView(v)
        builder.setCancelable(false)

        alert = builder.create()
        alert!!.show()
        setData(input.text.toString())
    }

    private fun onClick() {

        v.btn_Input_Ok.setOnClickListener {
           input.text = v.et_Input_Data.text.toString().trim()
            alert!!.cancel()
        }

        v.btn_Input_Cancle.setOnClickListener {
            alert!!.cancel()
        }

    }

    private fun setData(data: String) {
        v.et_Input_Data.setText(data)
    }

}
