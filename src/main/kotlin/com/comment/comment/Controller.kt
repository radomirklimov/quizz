package com.comment.comment

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    val service: QService
) {

    @GetMapping("/get-quizz")
    fun getQuizz(): ResponseEntity<QEntity>{
        val q = service.getRandomQ()

        if (q == null){
            return ResponseEntity.badRequest().build()
        }
        return ResponseEntity.ok(q)
    }

//    @GetMapping("/yes-no")
//    fun yesNo(@RequestBody yn: Char): ResponseEntity<Void>{
//        if (yn != 'y' && yn != 'n'){
//            return ResponseEntity.badRequest().build()
//        }
//
//        service.yesNo(yn)
//
//        return ResponseEntity.ok().build()
//    }
}