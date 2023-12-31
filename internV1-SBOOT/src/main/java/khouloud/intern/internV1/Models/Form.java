package khouloud.intern.internV1.Models;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.processing.Generated;
import java.io.Serializable;

@Data
@Entity
@EntityScan
@Table(name ="T_Form" , uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
public class Form implements Serializable {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;
    private String email;

    private String username;

    public Form() {}

    public Form(long id, String email, String username) {
        this.id = id;
        this.email = email;
        this.username = username;
    }



}
