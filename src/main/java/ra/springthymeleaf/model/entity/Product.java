package ra.springthymeleaf.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Products")
public class Product { // thuc the n - 1
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // tao bang chua id moi
    @Column(name = "id")
    private Long productId;
    @Column(name = "name")
    private String productName;
    @Column(name = "price")
    private BigDecimal productPrice;
    @ManyToOne
    @JoinColumn(name ="category_id")
    private Category category;
}
