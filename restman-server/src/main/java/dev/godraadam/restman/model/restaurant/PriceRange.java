package dev.godraadam.restman.model.restaurant;

import javax.persistence.Embeddable;

@Embeddable
public enum PriceRange {
    CHEAP,
    BUDGET,
    AVERAGE,
    EXPENSIVE,
    PREMIUM
}
