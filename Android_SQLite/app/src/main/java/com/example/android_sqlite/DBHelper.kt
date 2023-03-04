package com.example.android_sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context?,
               name: String?,
               factory: SQLiteDatabase.CursorFactory?,
               version: Int):
    SQLiteOpenHelper(context, name, factory, version) {

    companion object {
        const val DATABASE_NAME = "PhoneBook.db"
        const val DATABASE_VERSION = 1
        const val TABLE_NAME = "book_table"
        const val COL1_ID = "_id"
        const val COL2_NAME = "name"
        const val COL3_PHONE = "phone"
        const val COL4_EMAIL = "email"
    }

    //테이블 생성시 호출되는 함수
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    //테이블이 변경되었을 때 호출되는 함수
    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        if (p1 != p2) {
            p0?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
            onCreate(p0)
        }
}
}