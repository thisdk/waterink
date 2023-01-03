package io.github.thisdk.reader.database.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/*********************************************************
 * 存储类  书
 *********************************************************
 *  @property bid               唯一ID
 *  @property name              名字
 *  @property author            作者
 *  @property link              链接
 *  @property catalog           目录章节数
 *  @property chapter           上次阅读章节索引
 *  @property time              累计阅读时长
 *  @property word              累计阅读字数
 *  @property speed             平均阅读速度
 *  @property updatedAt         上次阅读时间
 *  @property finishedAt        结束阅读时间
 *  @property createdAt         加入书架时间
 */
@Entity
data class Book(
    @PrimaryKey(autoGenerate = true) val bid: Int = 0,
    @ColumnInfo val name: String,
    @ColumnInfo val author: String,
    @ColumnInfo val link: String,
    @ColumnInfo val catalog: Int,
    @ColumnInfo val chapter: Int,
    @ColumnInfo val time: Int,
    @ColumnInfo val word: Int,
    @ColumnInfo val speed: Int,
    @ColumnInfo val updatedAt: Long,
    @ColumnInfo val finishedAt: Long,
    @ColumnInfo val createdAt: Long,
)