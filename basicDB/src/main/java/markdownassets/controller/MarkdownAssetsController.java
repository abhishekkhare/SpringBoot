package markdownassets.controller;

;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import markdownassets.controller.dto.MarkdownAssetsDto;
import markdownassets.controller.mapper.MarkdownAssetsDtoMapper;
import markdownassets.domain.MarkdownAssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.List;

/**
 * This controller is to handle the custom uiAssets functionality.
 */
@RestController
public class MarkdownAssetsController {
    private final MarkdownAssetsService service;
    private final MarkdownAssetsDtoMapper mapper;

    @Autowired
    public MarkdownAssetsController(MarkdownAssetsService service, MarkdownAssetsDtoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping(value = "/api-management/1.0/apis/{apiUuid}/docs", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    //@PreAuthorize("@CASecurity.isCallAllowed('API','READ')")
    public List<MarkdownAssetsDto> getAPIMarkDownAsset(@PathVariable("apiUuid") String apiUuid) {
        System.out.println("GET Request for Markdown!!!" + apiUuid);
        return mapper.fromDomain(service.getAllAPIMarkdownAsset(apiUuid));
    }

    @PostMapping(
            value = "/api-management/1.0/apis/{apiUuid}/docs",
            consumes = {"multipart/form-data"},
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Post API Asset.")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 204, message = "No Content"),
                    @ApiResponse(code = 400, message = "Bad Request"),
                    @ApiResponse(code = 500, message = "Server Failure")})
    //@PreAuthorize("@CASecurity.isCallAllowed('API','UPDATE')")
    public void postAPIMarkDownAsset( @PathVariable("apiUuid") final String apiUuid,  @ModelAttribute MarkdownAssetsDto markdownAssetsDto) throws IOException {
        System.out.println("POST Request for Markdown!!!" + apiUuid);
        service.saveAPIMarkdownAsset(mapper.toDomain(markdownAssetsDto));

    }
}
