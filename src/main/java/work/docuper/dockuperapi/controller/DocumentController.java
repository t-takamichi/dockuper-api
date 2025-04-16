package work.docuper.dockuperapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/document")
public class DocumentController {
    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String getALL() {
        return "document";
    }
}
