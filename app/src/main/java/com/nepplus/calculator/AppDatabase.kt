package com.nepplus.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nepplus.calculator.dao.HistoryDao
import com.nepplus.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract  fun historyDao() : HistoryDao
}