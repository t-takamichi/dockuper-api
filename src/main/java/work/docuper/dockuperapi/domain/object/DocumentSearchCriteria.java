package work.docuper.dockuperapi.domain.object;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
