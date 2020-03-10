package markdownassets.dataaccess;

import markdownassets.dataaccess.entity.MarkdownAssetsEntity;
import markdownassets.dataaccess.mapper.MarkdownAssetsEntityMapper;
import markdownassets.domain.pojo.MarkdownAssets;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service("markdownDataAccessor")
public class MarkDownDataAccessorImpl implements MarkDownDataAccessor {

    private MarkdownAssetsDao markdownAssetsDao;
    private MarkdownAssetsEntityMapper mapper;

    @Autowired
    public MarkDownDataAccessorImpl(MarkdownAssetsDao markdownAssetsDao, MarkdownAssetsEntityMapper mapper) {
        this.markdownAssetsDao = markdownAssetsDao;
        this.mapper = mapper;
    }

    @Override
    public List<MarkdownAssets> findAll(String apiUuid) {
        Set<MarkdownAssetsEntity> entities = markdownAssetsDao.findAllBytype_uuid(apiUuid);
        return mapper.toDomain(entities);
    }

    @Override
    public MarkdownAssets save(MarkdownAssets markdownAssets) {
        Validate.notNull(markdownAssets, "");
        MarkdownAssetsEntity entitie = mapper.fromDomain(markdownAssets);
        return mapper.toDomain(markdownAssetsDao.save(entitie));
    }
}
