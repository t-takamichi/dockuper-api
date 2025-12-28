package work.docuper.dockuperapi.domain.object;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import work.docuper.dockuperapi.application.response.OutputDocument;

import java.util.Date;

/**
 * ドキュメントのドメイン
 */
@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDomain {
    private Integer documentId;
    private String title;
    private String body;
    private Date createdAt;
    private Date updatedAt;

    public OutputDocument toResponse() {
       return OutputDocument
               .builder()
               .documentId(this.documentId)
               .body(this.body)
               .title(this.title)
               .createdAt(this.createdAt)
               .updatedAt(this.updatedAt)
               .build();
    }
}
