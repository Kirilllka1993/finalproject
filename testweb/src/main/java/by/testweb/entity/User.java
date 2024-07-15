package by.testweb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @SequenceGenerator(name = "userGenerator", sequenceName = "s_users", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userGenerator")
    private Long id;

    @Column(name = "username")
    private String userName;

    private String password;

    private String email;

    private String phone;

}
