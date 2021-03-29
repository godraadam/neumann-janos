package dev.godraadam.restman.model.user;

import javax.persistence.Embeddable;

@Embeddable
public enum UserRole {
    CUSTOMER,
    RESTAURANT_EMPLOYEE,
    RESTAURANT_MANAGER,
    ADMIN
}
