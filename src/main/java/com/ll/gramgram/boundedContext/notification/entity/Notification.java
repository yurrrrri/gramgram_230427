package com.ll.gramgram.boundedContext.notification.entity;

import com.ll.gramgram.base.baseEntity.BaseEntity;
import com.ll.gramgram.boundedContext.instaMember.entity.InstaMember;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class Notification extends BaseEntity {

    private LocalDateTime readDate;

    @ManyToOne
    @ToString.Exclude
    private InstaMember toInstaMember;

    @ManyToOne
    @ToString.Exclude
    private InstaMember fromInstaMember;

    private String typeCode;
    private String oldGender;
    private int oldAttractiveTypeCode;
    private String newGender;
    private int newAttractiveTypeCode;
}
