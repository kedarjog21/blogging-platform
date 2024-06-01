package org.uplifttech.sqlconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Where;

@Entity(name = "blogs")
@EqualsAndHashCode(callSuper = false)
@Data
@Table(indexes = {@Index(name = "idx_blogs_id", columnList = "id", unique = true)})
@Where(clause = "deleted_at IS NULL")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    String content;
    int authorId;
    int votes;
}
