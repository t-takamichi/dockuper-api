package work.docuper.dockuperapi.domain.object;

import lombok.*;

@Data
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentSearchCriteria {
    private Integer id;
    private String title ;
    private String body;
}
