package ra.springthymeleaf.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Identification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // tao bang chua id moi
    private Long id;
    private String serialNumber;
    @OneToOne(mappedBy = "identification")
    private Student student;
}
