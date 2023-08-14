package wresni.project.app.gateways;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseFilter {
    private int pageNo;
    private int pagetSize;
}
