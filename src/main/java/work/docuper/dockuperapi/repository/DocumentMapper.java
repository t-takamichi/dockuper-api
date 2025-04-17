package work.docuper.dockuperapi.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import work.docuper.dockuperapi.domain.DocumentDomain;

import java.util.List;

@Mapper
public interface DocumentMapper {
    @Select("select * from document")
    List<DocumentDomain> findAll();
}
