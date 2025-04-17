package work.docuper.dockuperapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import work.docuper.dockuperapi.domain.DocumentDomain;
import work.docuper.dockuperapi.service.DocumentService;

import java.util.List;

@RestController
@RequestMapping("/v1/document")
@CrossOrigin
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<DocumentDomain> getALL() {
        return documentService.fetchAllDocument();
    }
}
