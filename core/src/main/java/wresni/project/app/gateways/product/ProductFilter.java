package wresni.project.app.gateways.product;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductFilter {
    private UUID productId;
    private List<UUID> productIds;
}
