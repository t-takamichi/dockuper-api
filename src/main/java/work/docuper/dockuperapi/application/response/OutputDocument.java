package work.docuper.dockuperapi.application.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
