package dev.godraadam.restman.model.menu;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompositeMenuItem {
    
    private List<MenuItem> items;
}
