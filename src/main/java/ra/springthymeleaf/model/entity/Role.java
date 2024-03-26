package ra.springthymeleaf.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // tao bang chua id moi
    @Column(name = "id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private RoleName roleName;
    @ManyToMany(mappedBy = "roleSet")
    private List<Student> students;
}
