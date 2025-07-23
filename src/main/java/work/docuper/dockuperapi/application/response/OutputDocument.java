package work.docuper.dockuperapi.application.response;

import lombok.*;
import work.docuper.dockuperapi.domain.object.DocumentDomain;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutputDocument {
    private Integer documentId;
    private String title;
    private String body;
    private Date createdAt;
    private Date updatedAt;

}
