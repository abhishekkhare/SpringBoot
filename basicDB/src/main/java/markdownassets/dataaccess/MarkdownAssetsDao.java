package markdownassets.dataaccess;

import com.abhi.spring.edu.springboot.helper.BaseJpaDao;
import com.abhi.spring.edu.springboot.helper.CompositeKey;
import markdownassets.dataaccess.entity.MarkdownAssetsEntity;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface MarkdownAssetsDao extends BaseJpaDao<MarkdownAssetsEntity, CompositeKey> {
    Set<MarkdownAssetsEntity> findAllBytype_uuid(String type_uuid);


}
