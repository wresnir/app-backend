package wresni.project.app.product;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
    private UUID productId;
    private UUID brandId;
    private String productName;
}
