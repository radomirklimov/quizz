package com.comment.comment

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity(name = "quizz_tbl")
class QEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var question: String = "",

    var yes: Long = 0,

    var no: Long = 0,

    var answer: String = ""
)