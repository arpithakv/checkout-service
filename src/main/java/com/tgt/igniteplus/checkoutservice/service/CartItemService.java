package com.tgt.igniteplus.checkoutservice.service;


import com.tgt.igniteplus.checkoutservice.dao.CartItemDAO;
import com.tgt.igniteplus.checkoutservice.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CartItemService {


    private static CartItemDAO cartItemDAO;

    @Autowired
    public CartItemService(CartItemDAO cartItemDAO) {
        this.cartItemDAO = cartItemDAO;
    }

    //getAllItemCartItem
    public static List<CartItem> getAll(){
        return cartItemDAO.findAll();
    }

    //createCartItem
    public CartItem create(CartItem cartItem){
        return cartItemDAO.save(cartItem);
    }

    //get Item list for a category (eg all shirts (both men/women))
    public List<CartItem> getItemsByCartId(String cartId) {
        List<CartItem>  items = cartItemDAO.findByCartId(cartId);
        return items;
    }

}


