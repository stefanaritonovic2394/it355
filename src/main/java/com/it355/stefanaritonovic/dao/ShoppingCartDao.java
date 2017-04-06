/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.stefanaritonovic.dao;

import com.it355.stefanaritonovic.entity.Category;
import com.it355.stefanaritonovic.entity.Product;
import com.it355.stefanaritonovic.entity.ShoppingCart;
import com.it355.stefanaritonovic.entity.ShoppingCartItem;
import java.util.List;

/**
 *
 * @author stefa
 */
public interface ShoppingCartDao {
    
    public List<Product> getProducts();
    public Product getProductById(int id);
    public List<Category> getCategories();
    public Category getCategoryById(int id);
    public void saveCart(ShoppingCart cart);
    public List<Product> getProductsByCategory(Category category);
    public List<ShoppingCart> getAllCarts();
    public List<ShoppingCartItem> getItemsByCart(ShoppingCart cart);
    public void editCategory(Category category);
    public Category addCategory(Category category);
    public void editProduct(Product product);
    public Product addProduct(Product product);
    public void editCart(ShoppingCart cart);
    public ShoppingCart getCartById(Integer id);
    public int getCountProductsInCategory(int categoryId);
    public int getCountProducts();
    public void deleteProduct(Product product);
    public void deleteCategory(Category category);
    public void deleteShoppingCart(ShoppingCart cart);
    public void deleteItem(ShoppingCartItem item);
    
}
