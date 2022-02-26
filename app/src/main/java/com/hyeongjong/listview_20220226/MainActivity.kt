package com.hyeongjong.listview_20220226

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hyeongjong.listview_20220226.adapters.StudentAdapter
import com.hyeongjong.listview_20220226.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    학생 목록을 담을 그릇
    val mStudentList = ArrayList<StudentData>()
//      나중에 넣을 때 :로 넣음
    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(StudentData("이형종",1991, "경기도 성남시"))
        mStudentList.add(StudentData("권효영",1988, "서울시 서대문구"))
        mStudentList.add(StudentData("김정환",1991, "경기도 성남시"))
        mStudentList.add(StudentData("김한균",1991, "경기도 성남시"))
        mStudentList.add(StudentData("문상현",1991, "경기도 성남시"))
        mStudentList.add(StudentData("최다영",1988, "서울시 강서구"))
        mStudentList.add(StudentData("최민서",1991, "서울시 송파구"))
        mStudentList.add(StudentData("유석균",1970, "경기도 성남시"))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { adapterView, view, position, l ->

//            position : 몇번 줄이 눌렸나? 알려줌. 0에서 출발.

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name}학생이 클릭됨", Toast.LENGTH_SHORT).show()
        }
        
        studentListView.setOnItemLongClickListener { adapterView, view, position, l -> 
            
            val longClickedStudent = mStudentList[position]

            Toast.makeText(this, "${longClickedStudent.name}학생이 길게 클릭됨", Toast.LENGTH_SHORT).show()
            
            return@setOnItemLongClickListener true
        }

    }
}