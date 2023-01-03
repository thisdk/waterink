package io.github.thisdk.reader.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import io.github.thisdk.reader.database.domain.Book
import kotlinx.coroutines.flow.Flow

@Dao
interface BookDao {

    @Query("SELECT * FROM book")
    fun findAll2Flow(): Flow<List<Book>>

    @Query("SELECT * FROM book")
    suspend fun findAll(): List<Book>

    @Insert
    suspend fun insert(user: Book)

    @Delete
    suspend fun delete(user: Book)

}
