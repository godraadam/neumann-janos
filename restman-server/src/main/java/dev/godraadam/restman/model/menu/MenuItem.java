package dev.godraadam.restman.model.menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MenuItem {
    

    private String name;
    private MenuItemCategory category;
    private Float price;
}
