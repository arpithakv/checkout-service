package com.tgt.igniteplus.checkoutservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table("cart_item")
public class CartItem {

    //in group-out find categories per by group
    //display categories for a particular group
    //men -shirt-image
    //men-pant

    @PrimaryKeyColumn(name = "cartid",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private String cartId;
    @PrimaryKeyColumn(name = "itemid",ordinal = 0,type = PrimaryKeyType.CLUSTERED)
    private String itemId;
    @Column("item_title")
    private String itemTitle;
    @Column("item_group")
    private String itemGroup;
    @Column("item_category")
    private String itemCategory;
    @Column("item_imageurl")
    private String itemImageURL;
    @Column("item_quantity")
    private Integer itemQuantity;
    @Column("item_price")
    private Float itemPrice;
    @Column("item_size")
    private String itemSize;

}
