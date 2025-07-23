package work.docuper.dockuperapi.application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import work.docuper.dockuperapi.application.request.InputSearchDocument;
import work.docuper.dockuperapi.domain.object.DocumentDomain;
import work.docuper.dockuperapi.domain.object.DocumentSearchCriteria;
import work.docuper.dockuperapi.domain.service.DocumentService;
import work.docuper.dockuperapi.application.response.OutputDocument;

import java.util.List;
import java.util.stream.Collectors;

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

    @RequestMapping(path = "/search", method = RequestMethod.GET)
    public List<OutputDocument> search(@ModelAttribute InputSearchDocument inputSearchDocument) {

        DocumentSearchCriteria criteria = new DocumentSearchCriteria(
                inputSearchDocument.getId(),
                inputSearchDocument.getTitle(),
                inputSearchDocument.getBody()
        );
        List<DocumentDomain> documentDomainList = documentService.searchDocument(criteria);

        return documentDomainList
                .stream()
                .map(DocumentDomain::toResponse)
                .collect(Collectors.toList());
    }
}
