package markdownassets.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.hateoas.ResourceSupport;

public class MarkdownAssetsDto  extends ResourceSupport {

    @JsonIgnore
    private String uuid;

    @JsonIgnore
    private String tenantId;

    private String type;

    @JsonIgnore
    private String type_uuid;

    @JsonIgnore
    private String org;

    @JsonIgnore
    private String locale;

    @JsonIgnore
    private String parent_uuid;

    private Integer status;

    private String title;

    private String navtitle;

    @JsonIgnore
    private String markdown;

    private Integer order;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_uuid() {
        return type_uuid;
    }

    public void setType_uuid(String type_uuid) {
        this.type_uuid = type_uuid;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getParent_uuid() {
        return parent_uuid;
    }

    public void setParent_uuid(String parent_uuid) {
        this.parent_uuid = parent_uuid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return navtitle;
    }

    public void setName(String name) {
        this.navtitle = navtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "MarkdownAssetsDto{" +
                "uuid='" + uuid + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", type='" + type + '\'' +
                ", type_uuid='" + type_uuid + '\'' +
                ", org='" + org + '\'' +
                ", locale='" + locale + '\'' +
                ", parent_uuid='" + parent_uuid + '\'' +
                ", status='" + status + '\'' +
                ", navtitle='" + navtitle + '\'' +
                ", title='" + title + '\'' +
                ", order=" + order +
                '}';
    }
}
