package work.docuper.dockuperapi.application.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InputSearchDocument {
    private Integer id;
    private String title;
    private String body;
}
