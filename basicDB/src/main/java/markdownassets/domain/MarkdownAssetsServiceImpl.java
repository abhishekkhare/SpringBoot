package markdownassets.domain;


import markdownassets.dataaccess.MarkDownDataAccessor;
import markdownassets.domain.pojo.MarkdownAssets;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;




@Service
public class MarkdownAssetsServiceImpl implements MarkdownAssetsService {

    private MarkDownDataAccessor markDownDataAccessor;

    @Autowired
    public MarkdownAssetsServiceImpl( MarkDownDataAccessor markDownDataAccessor) {
        this.markDownDataAccessor = markDownDataAccessor;
    }

    @Override
    @Transactional(readOnly = true)
    public List<MarkdownAssets> getAllAPIMarkdownAsset(String apiUuid) {
        Validate.notEmpty(apiUuid, "");
        Validate.notEmpty(apiUuid, "");
        //apiDataAccessor.find(apiUuid);
        return markDownDataAccessor.findAll(apiUuid);
    }

    @Override
    @Transactional
    public void saveAPIMarkdownAsset(MarkdownAssets markdownAssets) {
        Validate.notEmpty(markdownAssets.getType_uuid(), "");
        Validate.notEmpty(markdownAssets.getUuid(), "");
        //apiDataAccessor.find(markdownAssets.getType_uuid());
        markDownDataAccessor.save(markdownAssets);
    }
}
