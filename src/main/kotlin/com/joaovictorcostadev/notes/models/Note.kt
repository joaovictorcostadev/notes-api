package com.joaovictorcostadev.notes.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document("notes")
data class Note(
    @Id val id: ObjectId,
    val ownerId: ObjectId,
    val title: String,
    val color: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
    )
