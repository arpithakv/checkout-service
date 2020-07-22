package com.tgt.igniteplus.checkoutservice.controller;

import com.tgt.igniteplus.checkoutservice.model.CartItem;
import com.tgt.igniteplus.checkoutservice.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    //getAllCatItem
    @GetMapping("/cartItem")
    public List<CartItem> getAll(){
        return cartItemService.getAll();
    }

    //get an item by item id
    @GetMapping("/cartItem/{cartId}")
    public List<CartItem> getByCartId(@PathVariable("cartId") String cartId){
        return cartItemService.getItemsByCartId(cartId);
    }

    //createGroup-cat
    @PostMapping("/cartItem")
    public CartItem createCartItem(@RequestBody CartItem cartItem){
        return cartItemService.create(cartItem);
    }

    @GetMapping("/cartItem/{cartId}/{itemId}/{itemSize}")
    public CartItem getByCartIdItemIdItemSize(@PathVariable("cartId") String cartId,
                                              @PathVariable("itemId") String itemId,
                                              @PathVariable("itemSize") String itemSize){
        return cartItemService.getItemByCartIdItemIdSize(cartId,itemId,itemSize);
    }

    @PutMapping("/cartItem/{cartId}/{itemId}/{itemSize}/{itemQuantity}")
    public CartItem getItemByCartIdItemIdSize(@PathVariable("cartId") String cartId,
                                              @PathVariable("itemId") String itemId,
                                              @PathVariable("itemQuantity") Integer itemQuantity,
                                              @PathVariable("itemSize") String itemSize){
        return cartItemService.updateItemByCartIdItemIdSize(cartId,itemId,itemQuantity,itemSize);
    }
}
