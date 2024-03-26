package ra.springthymeleaf.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity // chi dinh day la thuc the anh xa trong ORM
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    private String name;
    @OneToOne
    @JoinColumn(name = "identify_id")
    private Identification identification;

    @ManyToMany
    @JoinTable(
            name = "student_role",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roleSet;
}
