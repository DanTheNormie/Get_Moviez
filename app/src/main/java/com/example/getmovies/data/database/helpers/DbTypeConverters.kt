package com.example.getmovies.data.database.helpers


import androidx.room.TypeConverter
import java.util.*

class DbTypeConverters {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return if (value == null) null else Date(value)
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}