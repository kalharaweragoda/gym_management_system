package edu.kw.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor@ToString
@Entity
public class AdminEntity {
    @Id
    private String adminId;
    private String adminName;
    private String email;

}
