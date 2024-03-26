package ra.springthymeleaf.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ra.springthymeleaf.model.entity.Product;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Product> findAll() {
        Session session = sessionFactory.getCurrentSession(); // lay session hien tai
        List<Product> list = session.createQuery("from Product", Product.class).list();
        return list;
    }

    @Override
    public Product findById(Long id) {
        Session session = sessionFactory.getCurrentSession(); // lay session hien tai
        return session.find(Product.class, id);
    }

    @Override
    public void save(Product p) {
        Session session = sessionFactory.getCurrentSession(); // lay session hien tai
        if (p.getProductId()==null){
            // them moi
            session.persist(p);
        }else {
            session.merge(p);
        }
    }

    @Override
    public void deleteById(Long id) {
        Session session = sessionFactory.getCurrentSession(); // lay session hien tai
        Product p = session.find(Product.class, id);
        if (p!=null){
            session.delete(p);
        }
    }
}
