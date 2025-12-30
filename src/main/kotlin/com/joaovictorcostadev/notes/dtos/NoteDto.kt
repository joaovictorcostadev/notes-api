package com.joaovictorcostadev.notes.dtos

import org.bson.types.ObjectId
import java.time.LocalDateTime

data class NoteDto(
    val id: ObjectId,
    val ownerId: ObjectId,
    val title: String,
    val color: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)