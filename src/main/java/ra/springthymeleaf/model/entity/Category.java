package ra.springthymeleaf.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // tao bang chua id moi
    @Column(name = "id")
    private Long categoryId;
    @Column(name = "name")
    private String categoryName;
    @OneToMany(mappedBy = "category") // anh xa theo thuoc tinh quan he sang thuc the chủ the
    private List<Product> products;

}
