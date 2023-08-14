package wresni.project.app.gateways.product;

import wresni.project.app.product.ProductEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductGateway {
    Optional<ProductEntity> findById(UUID productId);
    List<ProductEntity> findAll(ProductFilter filter);
}
