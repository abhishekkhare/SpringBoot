package markdownassets.dataaccess.entity;

import com.abhi.spring.edu.springboot.helper.AuditedEntity;
import com.abhi.spring.edu.springboot.helper.CompositeKey;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MARKDOWN_ASSET")
@IdClass(CompositeKey.class)
public class MarkdownAssetsEntity extends AuditedEntity implements Serializable {

    private static final long serialVersionUID = 7043436326884230262L;

    @Id
    @Column(name = "UUID")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "com.layer7.portal.service.dao.impl.hibernate.FallBackUUIDGenerator")
    private String uuid;

    @Id
    @Column(name = "TENANT_ID")
    private String tenantId;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "TYPE_UUID")
    private String type_uuid;

    @Column(name = "ORG")
    private String org;

    @Column(name = "LOCALE")
    private String locale;

    @Column(name = "PARENT_UUID")
    private String parent_uuid;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "NAVTITLE")
    private String navtitle;

    @Column(name = "MARKDOWN")
    private String markdown;

    @Column(name = "ORDER")
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNavtitle() {
        return navtitle;
    }

    public void setNavtitle(String navtitle) {
        this.navtitle = navtitle;
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
        return "MarkdownAssetsEntity{" +
                "uuid='" + uuid + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", type='" + type + '\'' +
                ", type_uuid='" + type_uuid + '\'' +
                ", org='" + org + '\'' +
                ", locale='" + locale + '\'' +
                ", parent_uuid='" + parent_uuid + '\'' +
                ", status=" + status +
                ", title='" + title + '\'' +
                ", navtitle='" + navtitle + '\'' +
                ", order=" + order +
                '}';
    }


    public String getName() {
        return navtitle;
    }
}
