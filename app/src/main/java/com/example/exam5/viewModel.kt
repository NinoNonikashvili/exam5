package com.example.exam5

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.google.gson.Gson

class viewModel: ViewModel() {
    private val jsonString = " [ \n" +
            "[ \n" +
            "{ \n" +
            "\"field_id\":1, \n" +
            "\"hint\":\"UserName\", \n" +
            "\"field_type\":\"input\", \n" +
            "\"keyboard\":\"text\", \n" +
            "\"required\":false, \n" +
            "\"is_active\":true, \n" +
            "\"icon\":\"https://jemala.png\" \n" +
            "}, \n" +
            "{ \n" +
            "\"field_id\":2, \n" +
            "\"hint\":\"Email\", \n" +
            "\"field_type\":\"input\", \n" +
            "\"required\":true, \n" +
            "\"keyboard\":\"text\", \n" +
            "\"is_active\":true, \n" +
            "\"icon\":\"https://jemala.png\" \n" +
            "}, \n" +
            "{ \n" +
            "\"field_id\":3, \n" +
            "\"hint\":\"phone\", \n" +
            "\"field_type\":\"input\", \n" +
            "\"required\":true, \n" +
            "\"keyboard\":\"number\", \n" +
            "\"is_active\":true, \n" +
            "\"icon\":\"https://jemala.png\" \n" +
            "} \n" +
            "], \n" +
            "[ \n" +
            "{ \n" +
            "\"field_id\":4,\n" +
            "\"hint\":\"FullName\", \n" +
            "\"field_type\":\"input\", \n" +
            "\"keyboard\":\"text\", \n" +
            "\"required\":true, \n" +
            "\"is_active\":true, \n" +
            "\"icon\":\"https://jemala.png\" }, \n" +
            "{ \n" +
            "\"field_id\":14, \n" +
            "\"hint\":\"Jemali\", \n" +
            "\"field_type\":\"input\", \n" +
            "\"keyboard\":\"text\", \n" +
            "\"required\":false, \n" +
            "\"is_active\":true, \n" +
            "\"icon\":\"https://jemala.png\" }, \n" +
            "{ \n" +
            "\"field_id\":89, \n" +
            "\"hint\":\"Birthday\", \n" +
            "\"field_type\":\"chooser\", \n" +
            "\"required\":false, \n" +
            "\"is_active\":true, \n" +
            "\"icon\":\"https://jemala.png\" }, \n" +
            "{ \n" +
            "\"field_id\":898, \n" +
            "\"hint\":\"Gender\", \n" +
            "\"field_type\":\"chooser\", \n" +
            "\"required\":\"false\", \n" +
            "\"is_active\":true, \n" +
            "\"icon\":\"https://jemala.png\" } \n" +
            "] \n" +
            "]\n "
    val parsedJson:Fields = Gson().fromJson(jsonString, Fields::class.java )
    val item = parsedJson[0][0].fieldId


}