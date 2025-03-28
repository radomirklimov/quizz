package com.comment.comment

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class QService(
    val repository: QRepository
) {
    fun getRandomQ(): QEntity?{
        val randomId =  Random.nextLong(1, 11)
        return repository.findById(randomId).orElse(null)
    }

//    fun yesNo(yn: Char) {
//        if (yn == 'y'){
//            val y = repository.findById()
//        }
//    }
}