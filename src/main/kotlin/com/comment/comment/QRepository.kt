package com.comment.comment

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QRepository: JpaRepository<QEntity, Long>
