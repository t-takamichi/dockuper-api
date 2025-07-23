package work.docuper.dockuperapi.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentEntity {
    private Integer documentId;
    private String title;
    private String body;
    private Date createdAt;
    private Date updatedAt;
}
