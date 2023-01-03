package io.github.thisdk.reader.database

import androidx.room.Database
import androidx.room.RoomDatabase
import io.github.thisdk.reader.database.dao.BookDao
import io.github.thisdk.reader.database.domain.Book

@Database(
    version = 1,
    entities = [Book::class],
    autoMigrations = [],
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}