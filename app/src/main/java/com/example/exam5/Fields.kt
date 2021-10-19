package com.example.exam5


import com.google.gson.annotations.SerializedName

class Fields : ArrayList<FieldsSubList>()
class FieldsSubList : ArrayList<FieldsSubListItem>()
data class FieldsSubListItem(
    @SerializedName("field_id")
    val fieldId: Int?,
    @SerializedName("field_type")
    val fieldType: String?,
    @SerializedName("hint")
    val hint: String?,
    @SerializedName("icon")
    val icon: String?,
    @SerializedName("is_active")
    val isActive: Boolean?,
    @SerializedName("keyboard")
    val keyboard: String?,
    @SerializedName("required")
    val required: String?
)