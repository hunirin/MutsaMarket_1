package com.example.miniproject_basic_leegwnaghun.repository;

import com.example.miniproject_basic_leegwnaghun.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository
        extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findAllByCommentId(Long commentId);

    CommentEntity findByWriterAndAndPassword(String writer, String password);
}
