package com.hyeongjong.listview_20220226.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.hyeongjong.listview_20220226.R
import com.hyeongjong.listview_20220226.datas.StudentData

class StudentAdapter(
    val mContext : Context, //어느 화면에서?
    val resId : Int, //어떤 xml을 기반으로?
    val mList : ArrayList<StudentData> //실제로 뿌려줄 학생들은 누구누구? 목록

    ) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {

            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)

        }
    }
}