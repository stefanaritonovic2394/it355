/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.it355.stefanaritonovic.dao.ShoppingCartDao;
import com.it355.stefanaritonovic.entity.Category;
import com.it355.stefanaritonovic.entity.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author stefa
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/StefanAritonovic-servlet.xml"})
public class CrudTestЈUnit {
    
    @Autowired
    protected ShoppingCartDao shoppingCartDao;
    
    @Autowired
    private ApplicationContext context;
    
    @Before
    public void setUp() {
        
    }
    
    @Test
    public void addCategoryTest() {
        Category cat = new Category();
        cat.setName("Nova kategorija");
        Category newCat = shoppingCartDao.addCategory(cat);
        shoppingCartDao.deleteCategory(newCat);
        Assert.assertNotNull(newCat);
    }
    
    @Test
    public void getCategoryByIdTest() {
        Category cat = new Category();
        cat.setName("Nova kategorija");
        Category newCat = shoppingCartDao.addCategory(cat);
        Category get = shoppingCartDao.getCategoryById(newCat.getId());
        shoppingCartDao.deleteCategory(newCat);
        Assert.assertNotNull(get);
    }
    
    @Test
    public void deleteCategoryTest() {
        Category cat = new Category();
        cat.setName("Nova kategorija");
        Category newCat = shoppingCartDao.addCategory(cat);
        shoppingCartDao.deleteCategory(newCat);
        Category deletedCategory = shoppingCartDao.getCategoryById(newCat.getId());
        Assert.assertNull(deletedCategory);
    }
    
    @Test
    public void addProductTest() {
        Product pro = new Product();
        pro.setName("Ime");
        pro.setPrice(2000d);
        pro.setEnabled(Boolean.TRUE);
        Product newPro = shoppingCartDao.addProduct(pro);
        shoppingCartDao.deleteProduct(newPro);
        Assert.assertNotNull(newPro);
    }
    
    @Test
    public void getProductByIdTest() {
        Product pro = new Product();
        pro.setName("Ime");
        pro.setPrice(2000d);
        pro.setEnabled(Boolean.TRUE);
        Product newPro = shoppingCartDao.addProduct(pro);
        Product get = shoppingCartDao.getProductById(newPro.getId());
        shoppingCartDao.deleteProduct(newPro);
        Assert.assertNotNull(get);
    }
    
    @Test
    public void deleteProductTest() {
        Product pro = new Product();
        pro.setName("Ime");
        pro.setPrice(2000d);
        pro.setEnabled(Boolean.TRUE);
        Product newPro = shoppingCartDao.addProduct(pro);
        shoppingCartDao.deleteProduct(newPro);
        Product deletedProduct = shoppingCartDao.getProductById(newPro.getId());
        Assert.assertNull(deletedProduct);
    }
    
}
